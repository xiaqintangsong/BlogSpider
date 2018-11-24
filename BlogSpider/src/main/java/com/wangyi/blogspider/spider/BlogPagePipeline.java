package com.wangyi.blogspider.spider;


import com.wangyi.blogspider.pojo.Blog;
import com.wangyi.blogspider.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.List;

@Service
public class BlogPagePipeline implements Pipeline {
    @Autowired
    private BlogService service;

    @Override
    public void process(ResultItems resultItems, Task task) {

        List<Blog> blogs = resultItems.get("blogs");
        for (Blog blog : blogs
        ) {
            if (service.isExist(blog.getTitle())) {
                System.out.println("新增" + service.save(blog));
            }
        }
    }
}
