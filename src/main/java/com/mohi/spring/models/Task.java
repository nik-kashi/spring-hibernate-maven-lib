package com.mohi.spring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by saeed on 1/March/15 AD.
 */

@Entity
public class Task implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    private String taskTitle;

    public Task() {
    }

    public Task(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }
}