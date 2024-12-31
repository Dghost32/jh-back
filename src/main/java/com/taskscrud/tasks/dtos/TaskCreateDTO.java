package com.taskscrud.tasks.dtos;

import com.taskscrud.tasks.models.Task;

import lombok.Data;

@Data
public class TaskCreateDTO {
    private String task;
    private String description;

    public Task toTask() {
        return Task.builder()
                .task(this.task)
                .description(this.description)
                .build();
    }
}
