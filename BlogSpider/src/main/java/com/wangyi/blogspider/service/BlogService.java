package com.wangyi.blogspider.service;

import com.wangyi.blogspider.pojo.Blog;

import java.util.List;

public interface BlogService {

    int save(Blog blog);

    List<Blog> selectAPage(int index, int count);

    boolean isExist(String title);
}
