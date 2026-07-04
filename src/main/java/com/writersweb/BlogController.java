package com.writersweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

    @GetMapping("/post")
    public String post() {
        return "post";
    }
}
