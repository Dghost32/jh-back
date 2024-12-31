package com.taskscrud.tasks.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskscrud.tasks.dtos.TaskCreateDTO;
import com.taskscrud.tasks.models.Task;
import com.taskscrud.tasks.services.TasksService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class Tasks {
    private final TasksService tasksService;

    @GetMapping
    public List<Task> getTasks() {
        List<Task> tasks = tasksService.getTasks();
        return tasks;
    }

    @PostMapping
    public Task createTask(@RequestBody TaskCreateDTO newTask) {
        Task task = tasksService.createTask(newTask);
        return task;
    }

}