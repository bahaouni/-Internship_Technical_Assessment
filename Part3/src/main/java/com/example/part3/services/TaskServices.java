package com.example.part3.services;

import com.example.part3.entites.Task;
import com.example.part3.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskServices {
    private final TaskRepository taskRepository ;
    public Task CreateTask(Task task){
        return  this.taskRepository.save(task);

    }
    public List<Task> getAllTasks(){
        return  this.taskRepository.findAll();

    }
    public  void DeleteTask(Long id){
        Optional<Task> task = this.taskRepository.findById(id);
        this.taskRepository.delete(task);
    }
    public  Task UpdateTask(Task task){
        Optional<Task> oldTask = this.taskRepository.findById(task.getId());
        this.taskRepository.delete(oldTask);

        return this.taskRepository.save(task) ;


    }


}
