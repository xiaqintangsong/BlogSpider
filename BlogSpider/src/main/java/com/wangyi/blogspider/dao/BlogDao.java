package com.wangyi.blogspider.dao;

import com.wangyi.blogspider.mapper.BlogMapper;
import com.wangyi.blogspider.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface BlogDao {

    int save(Blog blog);

    List<Blog> selectAPage(int index, int count);


}
