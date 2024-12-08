package org.example.DAL;

import org.example.DAL.Tasks.HighPriorityTask;
import org.example.DAL.Tasks.LowPriorityTask;
import org.example.DAL.Tasks.MediumPriorityTask;

public class TaskFactory {
    /* mobile factory will create different mobiles based on the id we are giving
    while creating object */
    Task t1;
    public TaskFactory(Priority priority) {
        if(priority==Priority.LOW) {
            t1=new LowPriorityTask();
        }
        else if(priority==Priority.MEDIUM) {
            t1=new MediumPriorityTask();
        }
        else if(priority==Priority.HIGH) {
            t1=new HighPriorityTask();
        }
        else {
            t1=null;
        }
    }
    public Task getTask() {
        return t1;
    }
}
