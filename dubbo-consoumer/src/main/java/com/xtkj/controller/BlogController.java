package com.xtkj.controller;

import com.xtkj.api.IBlogService;
import com.xtkj.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @ResponseBody
    @RequestMapping("blog/BlogMsg")
    private JsonResult getBlogs(){
        JsonResult j = new JsonResult();
        j.setResult(blogService.findBlogs());
        return j;
    }
}
