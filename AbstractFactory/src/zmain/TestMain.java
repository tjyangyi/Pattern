package zmain;

import abstarctCreator.PizzaStore;
import abstractPorductCollection.Pizza;
import concreteCreator.ChicagoPizzaStore;
import concreteCreator.NewYorkPizzaStore;

public class TestMain {

	public static void main(String[] args) {
		PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		
		Pizza pizza1 = newYorkPizzaStore.orderPizza(Pizza.CHEESE);
		System.out.println(pizza1.toString());
		
		Pizza pizza2 = chicagoPizzaStore.orderPizza(Pizza.PEPPERONI);
		System.out.println(pizza2.toString());
	}

}
