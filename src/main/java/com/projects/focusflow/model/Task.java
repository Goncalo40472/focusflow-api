package com.projects.focusflow.model;

import jakarta.validation.constraints.NotBlank;

public class Task {

    private Long id;

    @NotBlank(message = "Title is mandatory")
    private String title;

    private boolean completed;

    public Task() {}

    public Task(Long id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}
