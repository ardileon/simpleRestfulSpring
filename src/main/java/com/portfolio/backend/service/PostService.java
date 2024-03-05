package com.portfolio.backend.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.portfolio.backend.model.Post;

@Service
public interface PostService {

  public Post addPost(Post post);

  public Post getPostById(long id);

  public List<Post> getAllPost();

  public Post updatePost(Post post);

  public void deletePost(long id);

}
