package com.example.homework28.contoller;

import com.example.homework28.models.Product;
import com.example.homework28.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/product")
    public String addProduc(@RequestParam("title") String title,
                            @RequestParam("price") Double price,
                            @RequestParam("number") Integer number) {

        System.out.println(title + " " + price + " " + number);

        Product product = Product.builder()
                .title(title)
                .price(price)
                .number(number)
                .build();

        System.out.println(product);

        productRepository.save(product);

        return "redirect:/product_add.html";
    }

}
