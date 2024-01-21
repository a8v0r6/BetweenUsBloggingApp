package com.project.betweenusbackend.Dao;

import com.project.betweenusbackend.Entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDao extends MongoRepository<Post,String> {
}
