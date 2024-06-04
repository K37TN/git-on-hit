package com.example.ontap.Bailam.service;

import com.example.ontap.Bailam.entity.Product;

import java.util.List;

public interface ProductService {
public List<Product> getAll();
public void add(Product product);
public void delete(Integer id);
public Product detail(Integer id);
public void update(Product product);
}
