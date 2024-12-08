package org.example.DAL.Tasks;

import org.example.DAL.Category;
import org.example.DAL.Priority;
import org.example.DAL.Task;

import java.util.Date;
import java.util.List;

public class MediumPriorityTask implements Task {
    private String title ;
    private String description ;
    private Date date ;
    private Priority priority=Priority.MEDIUM;
    private List<Category> categories ;

    public MediumPriorityTask(String title, String description, Date date, Priority priority, List<Category> categories) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.priority = priority;
        this.categories = categories;
    }


    public String getTitle() {
        return title;
    }
public  MediumPriorityTask(){

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
