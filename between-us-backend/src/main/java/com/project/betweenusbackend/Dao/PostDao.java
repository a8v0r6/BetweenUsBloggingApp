package com.project.betweenusbackend.Dao;

import com.project.betweenusbackend.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDao extends JpaRepository<Post,String> {
}
