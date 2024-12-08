package com.example.part3.repository;

import com.example.part3.entites.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task,Long> {
    void delete(Optional<Task> task);
}
