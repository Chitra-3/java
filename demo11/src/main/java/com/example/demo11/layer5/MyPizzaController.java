package com.example.demo11.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo11.layer2.Pizza;
import com.example.demo11.layer4.PizzaService;
@RestController
@RequestMapping("/pizzahut")
public class MyPizzaController {
    @GetMapping("/greet")
    public String welcome(){
        return "<h1> Welcome to Spring Controller</h1>";
    }
    @GetMapping("/home")
    public String myHomePage(){
        return "<h1> Welcome to Home</h1>";
    }
    @Autowired
    PizzaService pizzaService;
    
    @GetMapping("/getPizzas")
    public List<Pizza> getAllThePizzas(){{
        System.out.println("Getting all pizzas");
        return pizzaService.getAllPizzas();
    }
    }
     @GetMapping("/getPizza/{pid}")
    public Pizza getTheSinglePizza(@PathVariable("pid") int x){
        System.out.println("Getting the single pizza");
        return pizzaService.orderingAPizza(x);
    }
        
    
    
}
