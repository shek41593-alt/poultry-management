package com.poultry.controller;

import com.poultry.model.Bird;
import com.poultry.repo.BirdRepository;
import com.poultry.dto.CreateBirdDto;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/birds")
public class BirdController {
  private final BirdRepository repo;
  public BirdController(BirdRepository repo) { this.repo = repo; }

  @GetMapping
  public java.util.List<Bird> all() { return repo.findAll(); }

  @PostMapping
  public Bird create(@RequestBody CreateBirdDto dto) {
    Bird b = new Bird();
    b.setTagId(dto.tagId);
    b.setBreed(dto.breed);
    if (dto.dob != null) b.setDob(LocalDate.parse(dto.dob));
    return repo.save(b);
  }
}
