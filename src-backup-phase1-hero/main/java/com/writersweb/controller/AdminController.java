package com.writersweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String dashboard() {
        return "admin/dashboard";
    }

    @GetMapping("/admin/posts")
    public String posts() {
        return "admin/posts";
    }

    @GetMapping("/admin/posts/new")
    public String newPost() {
        return "admin/new-post";
    }

    @GetMapping("/admin/posts/edit")
    public String editPost() {
        return "admin/edit-post";
    }
}