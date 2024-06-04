package com.example.ontap.Bailam.controller;

import com.example.ontap.Bailam.repository.ProductRepository;
import com.example.ontap.Bailam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public String showlist(Model model){
        model.addAttribute("list",productService.getAll());
        return "redirect:/shop/index";
    }

}
