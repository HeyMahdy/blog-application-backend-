package com.example.blog_app.controllers;

import com.example.blog_app.entity.Comment;
import com.example.blog_app.service.CommentService;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentControler {

    private CommentService commentService;

    public CommentControler(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/{useiD}")
    Comment comment (@RequestBody Comment comment,@PathVariable ObjectId useiD) {

        Comment cm = commentService.saveComment(comment, useiD);
        return cm;

    }

    @DeleteMapping("/{useiD}/{commentID}")
    String deleteComment(@PathVariable ObjectId useiD , @PathVariable ObjectId commentID) {
      return  commentService.deleteComment(useiD, commentID);

    }
}
