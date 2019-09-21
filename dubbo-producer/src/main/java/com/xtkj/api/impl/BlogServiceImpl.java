package com.xtkj.api.impl;

import com.xtkj.api.IBlogService;
import com.xtkj.dao.BlogMapper;
import com.xtkj.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private BlogMapper blogMapper;
    @Override
    public List<Blog> findBlogs() {
        return blogMapper.findBlogs();
    }
}
