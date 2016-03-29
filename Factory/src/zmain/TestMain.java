package zmain;

import product.Pizza;
import concreteCretor.ChicagoPizzaStore;
import concreteCretor.NewYorkPizzaStore;
import creator.PizzaStore;

public class TestMain {

	public static void main(String[] args) {
		PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		
		Pizza pizza1 = newYorkPizzaStore.orderPizza(Pizza.cheese);
		System.out.println(pizza1.toString());
		
		Pizza pizza2 = chicagoPizzaStore.orderPizza(Pizza.pepperoni);
		System.out.println(pizza2.toString());
	}

}
