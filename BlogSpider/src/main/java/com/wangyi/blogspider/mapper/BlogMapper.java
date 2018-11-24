package com.wangyi.blogspider.mapper;

import com.wangyi.blogspider.pojo.Blog;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BlogMapper {

    @Insert("insert into blog values(null,#{title},#{author},#{readnum},#{commentnum},now(),#{content},#{blogurl})")
    @Options(useGeneratedKeys = true)
    int save(Blog blog);

    @Select("select * from blog order by id asc limit #{index},#{count}")
    @ResultType(Blog.class)
    List<Blog> selectByPage(@Param("index") int index, @Param("count") int count);

    @Select("select count(*) from blog where title=#{title}")
    @ResultType(Integer.class)
    int isExist(String title);
}
