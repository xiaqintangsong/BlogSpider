package com.wangyi.blogspider.service.service.impl;

import com.wangyi.blogspider.mapper.BlogMapper;
import com.wangyi.blogspider.pojo.Blog;
import com.wangyi.blogspider.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper mapper;


    @Override
    public int save(Blog blog) {
        return mapper.save(blog);
    }

    @Override
    public List<Blog> selectAPage(int page, int count) {
        int index = 0;
        if (page > 0) {
            index = (page - 1) * count;
        }

        return mapper.selectByPage(index, count);
    }

    //结构大于0表示存在就返回false不再存入
    @Override
    public boolean isExist(String title) {
        return mapper.isExist(title) > 0 ? false : true;
    }
}
