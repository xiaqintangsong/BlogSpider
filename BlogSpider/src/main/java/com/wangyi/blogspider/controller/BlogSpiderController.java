package com.wangyi.blogspider.controller;

import com.wangyi.blogspider.spider.BlogPagePipeline;
import com.wangyi.blogspider.spider.BlogPageProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import us.codecraft.webmagic.Spider;

@RestController
public class BlogSpiderController {

    @Autowired
    private BlogPagePipeline pipeline;
    @Autowired
    private BlogPageProcess process;

    @GetMapping("/blogSpider")
    public String startSpider()
    {
        System.out.println("开始爬取……");
        new Spider(process).addUrl("https://www.cnblogs.com/").addPipeline(pipeline).thread(6).run();
        return "爬虫结束……";
    }

}
