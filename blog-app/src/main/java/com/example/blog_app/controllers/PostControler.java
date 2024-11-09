package com.example.blog_app.controllers;

import com.example.blog_app.entity.Posts;
import com.example.blog_app.service.PostService;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostControler {
    private  PostService postService;

    public PostControler(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    Posts createPost(@RequestBody Posts post) {
       Posts p = postService.save(post);
       return p;
    }

    @GetMapping
    List<Posts> allPosts() {
        List<Posts> ls = postService.getAllPosts();
        return ls;
    }

    @GetMapping("/{id}")
    Posts findPostById( @PathVariable ObjectId id) {
         Posts p = postService.getPostById(id);
         return p;
    }

    @DeleteMapping("/{id}")
    String deletePostById(@PathVariable ObjectId id) {
        return postService.deletePostById(id);
    }
}
