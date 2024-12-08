package org.example.Services;

import org.example.DAL.Category;
import org.example.DAL.Task;

import java.util.List;
import java.util.Map;

public class TaskCategoriesServices {
    private final List<Task> tasks ;
    private final List<Category> categories ;
    private final Map<Category,List<Task>> categoryMap ;
    public TaskCategoriesServices(List<Task> tasks , Map<Category,List<Task>> categoryMap, List<Category> categories   ){
        this.categoryMap=categoryMap;
        this.tasks=tasks;
        this.categories= categories ;

    }
    public void addTaskToCategory(Task task ,Category category){
        categoryMap.get(category).add(task);

    }
    public void RemoveTaskFromCategory(Task task,Category category ){
        categoryMap.get(category).remove(task);


    }
    public List<Category> AllCategories(){
        return categories ;
    }

}
