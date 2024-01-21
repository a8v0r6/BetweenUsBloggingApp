package com.project.betweenusbackend.Controller;

import com.project.betweenusbackend.Entity.Post;
import com.project.betweenusbackend.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/add-post")
    public Post addPost(@RequestBody Post post){
        return postService.addPost(post);
    }

    @GetMapping("/get-posts")
    public List<Post> getPosts() {
        return postService.getPost();
    }

    @GetMapping("/get-post/{id}")
    public Post getPostById(@PathVariable String id){
        return postService.getSinglePost(id);
    }
}
