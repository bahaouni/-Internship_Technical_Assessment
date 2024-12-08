package com.example.part3.entites;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Task {
    @jakarta.persistence.Id
    @Id
    private Long id;
    private String Title;
    private String description;
    private String category;
    private Date DueDate;
    private CompletionStatus completionStatus ;
    private Priority priority ;



}