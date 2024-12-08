package com.example.part3.controller;

import com.example.part3.entites.Task;
import com.example.part3.services.TaskServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/tasks/")
public class TaskController {
    private final TaskServices taskServices ;
    @PostMapping("/add")
    public Task createTask(@RequestBody Task task){
        return taskServices.CreateTask(task);
    }
    @DeleteMapping("/{id}")
    public void DeleteTask(@RequestParam Long id ){
        this.taskServices.DeleteTask(id);
    }
    @PatchMapping("/{id}")
    public Task UpdateTask(@RequestBody Task task ){
       return this.taskServices.UpdateTask(task);

    }
    @GetMapping()
    public List<Task> GetAllTasks(){
        return this.taskServices.getAllTasks() ;
    }
}
