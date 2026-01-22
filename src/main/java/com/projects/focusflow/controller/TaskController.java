package com.projects.focusflow.controller;

import com.projects.focusflow.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    @GetMapping("/tasks")
    public List<Task> getTasks() {

        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task(1L, "Estudar Spring Boot", false));
        tasks.add(new Task(2L, "Aprender Git", true));
        tasks.add(new Task(3L, "Criar projeto FocusFlow", false));

        return tasks;
    }

}
