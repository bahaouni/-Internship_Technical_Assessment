package org.example.Services;

import org.example.DAL.Task;

import java.util.List;

public class TaskPrioritiesService {
    private  final List<Task> taskList ;
    public TaskPrioritiesService( List<Task> taskList){
        this.taskList=taskList;

    }
}
