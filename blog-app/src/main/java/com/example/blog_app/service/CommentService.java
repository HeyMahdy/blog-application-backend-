package com.example.blog_app.service;

import com.example.blog_app.entity.Comment;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;


public interface CommentService {
    Comment saveComment(Comment comment , ObjectId postId);
    String deleteComment(ObjectId id , ObjectId commentId);
    String updateComment(Comment comment , ObjectId postId);
}
