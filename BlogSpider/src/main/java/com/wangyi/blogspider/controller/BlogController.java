package com.wangyi.blogspider.controller;

import com.wangyi.blogspider.pojo.Blog;
import com.wangyi.blogspider.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private BlogService service;



    //查询
    @GetMapping("/blogSome")
    public List<Blog> queryByPage(int page, int count){
        return service.selectAPage(page, count);
    }






}
