package com.example.blog_app.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Data
@Document
public class Posts {
    @Id
    private ObjectId id; // in mongodb to auto increament id use ObjectId
    private String title;
    private String content;
    private String author;
}
