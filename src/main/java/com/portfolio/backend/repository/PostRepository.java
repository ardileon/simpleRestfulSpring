package com.portfolio.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.backend.model.Post;

// membuat interface crud dari model (Post) ke service
@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

}
