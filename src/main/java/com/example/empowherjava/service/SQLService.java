package com.example.empowherjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SQLService
{

  @Autowired
  private JdbcTemplate jdbcTemplate;

  public List<Map<String, Object>> getAllBlogPosts(){
    String sql = "SELECT * FROM blog_post";
    return jdbcTemplate.queryForList(sql);
  }
}
