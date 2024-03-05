package com.portfolio.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// Disini model (Post) untuk buat table pada database blogger
@Entity
@Table(name="post_table")
public class Post {

  @Id()
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter @Setter private long id;

  @Getter @Setter private String author;

  @Getter @Setter private String email;

  @Getter @Setter private String genrePost;

  @Getter @Setter private String title;

  @Getter @Setter private String isian;

  @Getter @Setter private String kesimpulan;

  @Getter @Setter private java.sql.Date Waktu;



}
