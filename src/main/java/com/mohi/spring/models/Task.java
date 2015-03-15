package com.mohi.spring.models;

import javax.persistence.Column;
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

    @Column(name = "TASK_TITLE",unique = true)
    private String taskTitle;

    @Column
    private Boolean enable;

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

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}