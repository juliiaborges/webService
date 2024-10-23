package com.example.task;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    // Retorna todas as tarefas
    @GetMapping("/")
    public List<Task> getTasks() {
        return tasks;
    }

    // Retorna uma tarefa específica pelo ID
    @GetMapping("/{id}")
    public Task getTask(@PathVariable int id) {
        return tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Adiciona uma nova tarefa
    @PostMapping("/")
    public Task createTask(@RequestBody Task task) {
        tasks.add(task);
        return task;
    }
}
