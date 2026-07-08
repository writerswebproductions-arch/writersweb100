package com.writersweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("storeName", "Writers Web");
        return "index";
    }

    @GetMapping("/book")
    public String book() {
        return "book";
    }
}