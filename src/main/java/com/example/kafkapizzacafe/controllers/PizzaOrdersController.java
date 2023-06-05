package com.example.kafkapizzacafe.controllers;

import com.example.kafkapizzacafe.models.PizzaOrder;
import com.example.kafkapizzacafe.services.PizzaOrdersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
@AllArgsConstructor
public class PizzaOrdersController {

    private PizzaOrdersService pizzaOrdersService;

    @PostMapping("/create")
    public String create(@RequestBody PizzaOrder pizzaOrder) {

        pizzaOrdersService.create(pizzaOrder);

        return "ok";
    }
}
