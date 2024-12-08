package org.example.DAL.Tasks;

import org.example.DAL.Category;
import org.example.DAL.Priority;
import org.example.DAL.Task;

import java.util.Date;
import java.util.List;

public class LowPriorityTask implements Task {
    private String title ;
    private String description ;
    private Date date ;
    private Priority priority=Priority.LOW;
    private List<Category> categories ;

    public LowPriorityTask(String title, String description, Date date, Priority priority, List<Category> categories) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.priority = priority;
        this.categories = categories;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }
    public LowPriorityTask(){

    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }



    @Override
    public void updateTask(Task task) {

    }

    @Override
    public void DeleteTask(Task task) {

    }
}
