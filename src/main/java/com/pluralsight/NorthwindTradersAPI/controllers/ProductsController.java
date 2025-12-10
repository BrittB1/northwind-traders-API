package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    //temporary list - to be replaced w/ database
    private List<Product> products;

    public ProductsController() {

        products = new ArrayList<>();
        products.add(new Product(1, "Chai", 1, 18.00));
        products.add(new Product(2, "Chang", 1, 19.00));
        products.add(new Product(3, "Aniseed Syrup", 2, 10.00));
        products.add(new Product(4, "Chef Anton's Cajun Seasoning", 2, 22.00));
        products.add(new Product(5, "Chef Anton's Gumbo Mix", 2, 21.35));
    }

    @GetMapping
    public List<Product> products() {

        return products;
    }

    @GetMapping("/{id}")
    public Product getProductId(@PathVariable int id) {
        for (Product product : products)
            if (product.getProductId() == id) {

                return product;
            }
        return null;
    }
}
