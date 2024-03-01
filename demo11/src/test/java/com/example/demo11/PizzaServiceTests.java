package com.example.demo11;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo11.layer2.Pizza;
import com.example.demo11.layer4.PizzaService;

@SpringBootTest
public class PizzaServiceTests {

	@Autowired
	PizzaService pizzaService; //internally assigns PizzaServiceImpl's object here

	@Test
	public void letsFindSinglePizzaTest() {

		Pizza pizza = pizzaService.orderingAPizza(1);
		System.out.println("pizza : "+pizza);


	}

	@Test
	public void letsFindAllPizzas() {
		
		List<Pizza> allPizzas = pizzaService.getAllPizzas();
		for (Pizza pizza : allPizzas) {
			System.out.println("=> pizza : "+pizza);
		}
	}

	@Test
	public void addANewPizzaTest() {
		Pizza pizza = new Pizza();
		pizza.setPizzaNumber(5);
		pizza.setTypeOfPizza("Something new");
		pizza.setPizzaPrice(111);

		pizzaService.createPizza(pizza);

	}

	@Test
	public void modifyExistingPizzaTest() {
		Pizza pizza = new Pizza();
		pizza.setPizzaNumber(5);
		pizza.setTypeOfPizza("CHEEZE PIZZA");
		pizza.setPizzaPrice(222);

		pizzaService.modifyPizza(pizza);
	}

	@Test
	public void deleteExistingPizzaTest() {
		pizzaService.deletePizza(5);
	}


	
}