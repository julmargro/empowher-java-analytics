package com.example.empowherjava.controller;

import com.example.empowherjava.service.SQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SQLController {

  @Autowired
  private SQLService sqlService;

  @GetMapping("/all")
  public List<Map<String, Object>> getAllBlogPosts() {
    return sqlService.getAllBlogPosts();
  }

}
