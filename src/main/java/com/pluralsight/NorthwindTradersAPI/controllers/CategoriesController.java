package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// marks class as REST API controller
@RestController

// base path for entire controller
@RequestMapping("/categories")
public class CategoriesController {

    //temporary list - to be replaced w/ database
    private List<Category> categories;

    public CategoriesController() {
        categories = new ArrayList<>();
        categories.add(new Category(1, "Beverages"));
        categories.add(new Category(2, "Condiments"));
        categories.add(new Category(3, "Confections"));
        categories.add(new Category(4, "Dairy Products"));
    }
    @GetMapping
    public List <Category> getAllCategories() {
        return categories;

    }
    // id is a placeholder in the URL - can be any #
    // {} tell Spring 'this part of the URL varies'
    @GetMapping ("/{id}")
    public Category getCategoryId(@PathVariable int id) {
        for (Category category:categories)
            if (category.getCategoryId() == id) {

                return category;
            }
        return null;
    }
}
