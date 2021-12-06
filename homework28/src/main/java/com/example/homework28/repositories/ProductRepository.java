package com.example.homework28.repositories;

import com.example.homework28.models.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    List<Product> findAllByPrice(double price);
    List<Product> findAllByOrdersCount(int ordersCount);
    public void save(Product product);

}
