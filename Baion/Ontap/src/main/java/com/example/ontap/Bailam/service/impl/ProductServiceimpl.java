package com.example.ontap.Bailam.service.impl;

import com.example.ontap.Bailam.entity.Product;
import com.example.ontap.Bailam.repository.ProductRepository;
import com.example.ontap.Bailam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceimpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public void add(Product product) {
productRepository.save(product);
    }

    @Override
    public void delete(Integer id) {
productRepository.deleteById(id);
    }

    @Override
    public Product detail(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void update(Product product) {
productRepository.save(product);
    }
}
