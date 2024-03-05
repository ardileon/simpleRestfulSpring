package com.portfolio.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.backend.model.Post;
import com.portfolio.backend.service.PostService;

import java.util.List;
// dari service ke controller supaya client dapat akses data lewat logic service
@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ClientController {

  // service
  @Autowired
  private PostService postService;

  @RequestMapping("/")
  public String HelloWorld() {
    return "Hello mank";
  }

  // add Post
  @PostMapping("/add")
  public String addPost(@RequestBody Post post) {
    postService.addPost(post);
    return "Success fully added";
  }

  // get Post by id
  @RequestMapping("/post/{id}")
  public Post getPostById(@PathVariable("id") long id){
    return postService.getPostById(id);
  }

  // get all Post
  @RequestMapping("/posts")
  public List<Post> getAllPost(){
    return postService.getAllPost();
  }

  // update Post
  @PutMapping("/post")
  public Post updatePost(@RequestBody Post post){
    return postService.updatePost(post);
  }

  // delete Post By Id
  @DeleteMapping("/post/{id}")
  public String deletePost(@PathVariable("id") long id){
    postService.deletePost(id);
    return "Post berhasil di delete";
  }


}
