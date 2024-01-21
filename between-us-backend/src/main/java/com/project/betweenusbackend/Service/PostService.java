package com.project.betweenusbackend.Service;

import com.project.betweenusbackend.Entity.Post;

import java.util.List;

public interface PostService {
    Post addPost(Post post);

    List<Post> getPost();

    Post getSinglePost(String id);
}
