package com.example.blog_app.repo;

import com.example.blog_app.entity.Posts;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostRepostry extends MongoRepository<Posts, ObjectId> {


}
