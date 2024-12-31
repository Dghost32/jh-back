package com.taskscrud.tasks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskscrud.tasks.models.Task;

public interface TasksRepository extends JpaRepository<Task, Long> {

}