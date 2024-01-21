package com.project.betweenusbackend.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "posts")
public class Post {
    @Id
    private String postId;
    private String postTitle;
    private String postBody;
    private String postedBy;
}
