package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/Songform")
    public String loadformpage(Model model){
        model.addAttribute("Song",new Song());
        return "Songform";
    }
    @PostMapping("/Songform")
    public String loadformpage(@ModelAttribute Song song,Model model){
        model.addAttribute("Song",song);
        return "cofirmsong";

    }
}
