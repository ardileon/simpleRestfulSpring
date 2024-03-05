package com.portfolio.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.backend.model.Post;
import com.portfolio.backend.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

  // repository
  @Autowired
  private PostRepository postRepository;
  @Override
  public Post addPost(Post post) {
    return postRepository.save(post);
  }

  @Override
  public Post getPostById(long id) {
    return postRepository.findById(id).get();
  }

  @Override
  public List<Post> getAllPost() {
    return (List<Post>)postRepository.findAll();
  }

  @Override
  public Post updatePost(Post post) {
    return postRepository.save(post);
  }

  @Override
  public void deletePost(long id) {
    postRepository.deleteById(id);
  }

}
