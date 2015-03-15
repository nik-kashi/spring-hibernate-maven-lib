package com.mohi.spring.services;


import com.mohi.spring.daos.TaskDao;
import com.mohi.spring.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public void addTask(Task task) {
        if(task.getTaskTitle().startsWith("2")){
            task.setEnable(false);
        }
        taskDao.persist(task);
    }

    @Override
    public Task editTask(Task task) {
        return taskDao.merge(task);
    }

    @Override
    public Task getTask(Long taskId) {
        return taskDao.find(taskId, Task.class);
    }

    @Override
    public void deleteTask(Long taskId) {
        taskDao.remove(taskId, Task.class);
    }

    @Override
    public List<Task> listTasks() {
        return taskDao.getAll(Task.class);
    }
}
