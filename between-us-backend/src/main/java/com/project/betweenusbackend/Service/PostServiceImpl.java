package com.project.betweenusbackend.Service;

import com.project.betweenusbackend.Dao.PostDao;
import com.project.betweenusbackend.Entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDao postDao;

    @Override
    public Post addPost(Post post) {
        return postDao.save(post);
    }

    @Override
    public List<Post> getPost() {
        return postDao.findAll();
    }

    @Override
    public Post getSinglePost(String id) {
        return postDao.findById(id).get();
    }
}
