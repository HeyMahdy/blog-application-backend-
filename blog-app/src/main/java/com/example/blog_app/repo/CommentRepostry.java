package com.example.blog_app.repo;

import com.example.blog_app.entity.Comment;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepostry extends MongoRepository<Comment, ObjectId> {

}
