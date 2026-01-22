package com.projects.focusflow.controller;

import com.projects.focusflow.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/task")
    public Task getTask() {
        return new Task(1L, "Estudar Spring Boot", false);
    }

}
