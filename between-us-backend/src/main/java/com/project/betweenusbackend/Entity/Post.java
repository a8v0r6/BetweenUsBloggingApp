package com.project.betweenusbackend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    private String postId;
    private String postTitle;
    private String postBody;
    private String postedBy;
}
