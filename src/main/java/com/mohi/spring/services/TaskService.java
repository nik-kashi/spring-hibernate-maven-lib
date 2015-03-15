package com.mohi.spring.services;


import com.mohi.spring.models.Task;

import java.util.List;

public interface TaskService {
    void addTask(Task task);

    Task editTask(Task task);

    Task getTask(Long taskId);

    void deleteTask(Long taskId);

    List<Task> listTasks();

}
