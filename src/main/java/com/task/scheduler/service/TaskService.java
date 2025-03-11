package com.task.scheduler.service;

import com.task.scheduler.model.Task;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    /**
     * Schedule a new task and add it to the list.
     *
     * @param name Name of the task
     * @param time Scheduled time of the task
     */
    public void scheduleTask(String name, LocalDateTime time) {
        Task task = new Task(name, time);
        tasks.add(task);
    }

    /**
     * Get a list of all scheduled tasks.
     *
     * @return List of tasks
     */
    public List<Task> listTasks() {
        return tasks;
    }
}
