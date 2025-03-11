package com.task.scheduler.controller;

import com.task.scheduler.model.Task;
import com.task.scheduler.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    /**
     * Endpoint to schedule a new task.
     *
     * @param name Name of the task
     * @param time Scheduled time in ISO format (e.g., "2025-03-11T10:15:30")
     * @return Success message
     */
    @PostMapping("/schedule")
    public String scheduleTask(@RequestParam String name, @RequestParam String time) {
        try {
            LocalDateTime scheduledTime = LocalDateTime.parse(time);
            service.scheduleTask(name, scheduledTime);
            return "✅ Task scheduled successfully!";
        } catch (Exception e) {
            return "❌ Failed to schedule task. Please use ISO format (yyyy-MM-ddTHH:mm:ss)";
        }
    }

    /**
     * Endpoint to get a list of all scheduled tasks.
     *
     * @return List of tasks
     */
    @GetMapping("/list")
    public List<Task> listTasks() {
        return service.listTasks();
    }
}
