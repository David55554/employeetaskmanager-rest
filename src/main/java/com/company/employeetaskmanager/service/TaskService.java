package com.company.employeetaskmanager.service;

import com.company.employeetaskmanager.model.Task;
import com.company.employeetaskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public Task findById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public List<Task> findByTitle(String title) {
        return taskRepository.findByTitle(title);
    }

    public List<Task> findAllByOrderByTitle() {
        return taskRepository.findAllByOrderByTitle();
    }

    public long count() {
        return taskRepository.count();
    }

    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }
}
