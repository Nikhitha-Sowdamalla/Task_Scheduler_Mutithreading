package com.task.scheduler.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private LocalDateTime scheduledTime;

    public Task(String name, LocalDateTime scheduledTime) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.scheduledTime = scheduledTime;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scheduledTime=" + scheduledTime +
                '}';
    }
}
