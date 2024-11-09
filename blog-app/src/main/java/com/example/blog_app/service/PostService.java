package com.example.blog_app.service;

import com.example.blog_app.entity.Posts;
import org.bson.types.ObjectId;

import java.util.List;

public interface PostService {
    Posts save(Posts post);
    List<Posts> getAllPosts();
    Posts getPostById(ObjectId id);
    String deletePostById(ObjectId id);

}
