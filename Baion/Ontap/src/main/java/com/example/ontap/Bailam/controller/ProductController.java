package com.example.ontap.Bailam.controller;

import com.example.ontap.Bailam.entity.Product;
import com.example.ontap.Bailam.repository.ProductRepository;
import com.example.ontap.Bailam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public String showlist(Model model){
        model.addAttribute("list",productService.getAll());
        return "shop/index";
    }
@PostMapping("/add")
    public String add(Product product){
        productService.add(product);
        return "redirect:/shop/list";
}
@GetMapping("/delete")
    public String delete(Integer id){
        productService.delete(id);
        return "redirect:/shop/list";
}
@GetMapping("/showupdate")
    public String show(Model model,Integer id){
        model.addAttribute("list",productService.detail(id));
        return "/shop/update";
}
@PostMapping("update")
    public String update(Product product){
        productService.update(product);
        return "redirect:/shop/list";
}
}
