package com.writersweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CatalogController {

    @GetMapping("/catalog")
    public String catalog(Model model) {

        List<Book> books = List.of(
                new Book(
                        "The Last Empire",
                        "A young warrior discovers a forgotten kingdom.",
                        "$4.99"
                ),
                new Book(
                        "The Broken Throne",
                        "A kingdom collapses as rival heirs battle for power.",
                        "$6.99"
                ),
                new Book(
                        "The Shadow Script",
                        "A feature screenplay about a detective hunting a killer.",
                        "$9.99"
                )
        );

        model.addAttribute("books", books);

        return "catalog";
    }
}