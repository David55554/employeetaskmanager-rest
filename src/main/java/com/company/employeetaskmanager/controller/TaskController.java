package com.company.employeetaskmanager.controller;

import com.company.employeetaskmanager.model.Task;
import com.company.employeetaskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public Task save(@RequestBody Task task) {
        return taskService.save(task);
    }

    @GetMapping("/{id}")
    public Task findById(@PathVariable Long id) {
        return taskService.findById(id);
    }

    @GetMapping("/count")
    public long count() {
        return taskService.count();
    }

    @GetMapping("/sorted")
    public List<Task> findAllSorted() {
        return taskService.findAllByOrderByTitle();
    }

    @GetMapping("/search/{title}")
    public List<Task> findByTitle(@PathVariable String title) {
        return taskService.findByTitle(title);
    }

    @PutMapping("/{id}")
    public Task update(@PathVariable Long id,
                       @RequestBody Task task) {
        task.setId(id);
        return taskService.save(task);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        taskService.deleteById(id);
    }
}
