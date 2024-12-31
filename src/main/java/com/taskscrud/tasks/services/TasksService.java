package com.taskscrud.tasks.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.taskscrud.tasks.dtos.TaskCreateDTO;
import com.taskscrud.tasks.models.Task;
import com.taskscrud.tasks.repositories.TasksRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TasksService {
    private final TasksRepository tasksRepository;

    public List<Task> getTasks() {
        return tasksRepository.findAll();
    }

    public Task createTask(TaskCreateDTO newTask) {
        Task task = tasksRepository.save(newTask.toTask());

        return task;
    }
}
