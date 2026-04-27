package com.example.demo.controller;

import com.example.demo.model.Poster;
import com.example.demo.repository.PosterRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posters")
public class PosterController {

    private final PosterRepository repo;

    public PosterController(PosterRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Poster> getAllPosters() {
        return repo.findAll();
    }

    @PostMapping
    public Poster createPoster(@RequestBody Poster poster) {
        return repo.save(poster);
    }
}