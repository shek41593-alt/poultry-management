package com.poultry.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "birds")
public class Bird {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String tagId;
  private String breed;
  private LocalDate dob;
  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public String getTagId() { return tagId; }
  public void setTagId(String tagId) { this.tagId = tagId; }
  public String getBreed() { return breed; }
  public void setBreed(String breed) { this.breed = breed; }
  public LocalDate getDob() { return dob; }
  public void setDob(LocalDate dob) { this.dob = dob; }
}
