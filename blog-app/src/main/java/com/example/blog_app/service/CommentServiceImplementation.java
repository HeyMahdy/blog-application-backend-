package com.example.blog_app.service;

import com.example.blog_app.entity.Comment;
import com.example.blog_app.entity.Posts;
import com.example.blog_app.repo.CommentRepostry;
import com.example.blog_app.repo.PostRepostry;
import org.bson.types.ObjectId;
import org.hibernate.annotations.Comments;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentServiceImplementation implements CommentService {

   private CommentRepostry commentRepostry;
   private PostRepostry postRepostry;

    public CommentServiceImplementation(PostRepostry postRepostry, CommentRepostry commentRepostry) {
        this.postRepostry = postRepostry;
        this.commentRepostry = commentRepostry;
    }

    @Override
    public Comment saveComment(Comment comment, ObjectId postId) {
            Comment savedComment = commentRepostry.save(comment);
        Optional<Posts> Op = postRepostry.findById(postId);
        Posts p = Op.get();
           p.getComments().add(savedComment);
           postRepostry.save(p);
           return savedComment;

    }

    @Override
    public String deleteComment(ObjectId postId, ObjectId commentId) {

        Comment comment = commentRepostry.findById(commentId).orElse(null);
        commentRepostry.delete(comment);
        Optional<Posts> Op = postRepostry.findById(postId);
        Posts p = Op.get();
        p.getComments().remove(comment);
        postRepostry.save(p);


        return "deleted";
    }

    @Override
    public String updateComment(Comment comment, ObjectId id) {
        return "";
    }
}
