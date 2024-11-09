package com.example.blog_app.entity;

import jakarta.persistence.Id;
import jdk.jfr.Enabled;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Enabled
@Document
@Data
public class Comment {

    @Id
    private ObjectId id;
    private String description;

}
