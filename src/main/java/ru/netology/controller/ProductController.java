package ru.netology.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.repository.CustomerOrderRepository;

import java.util.List;

@RestController
public class ProductController {

    private final CustomerOrderRepository repository;

    public ProductController(CustomerOrderRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> fetchProducts(@RequestParam("name") String name) {
        return repository.getProductNames(name);
    }
}
