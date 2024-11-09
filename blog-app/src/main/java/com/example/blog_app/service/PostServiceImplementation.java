package com.example.blog_app.service;

import com.example.blog_app.entity.Posts;
import com.example.blog_app.repo.PostRepostry;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImplementation implements PostService {

    private PostRepostry postRepo;

    public PostServiceImplementation(PostRepostry postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public Posts save(Posts post) {
        Posts p = postRepo.save(post);
        return p;

    }

    @Override
    public List<Posts> getAllPosts() {
        List<Posts> ls  = postRepo.findAll();
        return ls;
    }

    @Override
    public Posts getPostById(ObjectId objectId) {

        Optional<Posts> Op = postRepo.findById(objectId);
        Posts p = Op.get();
        return p;
    }

    @Override
    public String deletePostById(ObjectId id) {
          postRepo.deleteById(id);
          return "Post deleted";
    }
}
