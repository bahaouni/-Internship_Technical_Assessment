package org.example.Services;

import org.example.DAL.Task;

import java.util.List;

public class TaskOperations {
    private final List<Task> tasks ;
    public TaskOperations(List<Task> tasks){
        this.tasks= tasks ;
    }
    public void updateTask(Task task ){
        task.updateTask(task);
    }
    public void DeleteTask(Task task ){
        task.DeleteTask(task);
    }
    public List<Task> getTasks(){
        return tasks ;
    }

}
