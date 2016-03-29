package concreteCreator;

import abstarctCreator.PizzaStore;
import abstractFacotry.PizzaIngredientFactory;
import abstractPorductCollection.Pizza;
import concreteFactory.NewYorkPizzaInredientFactory;
import concreteProductCollection.CheesePizza;
import concreteProductCollection.ClamPizza;
import concreteProductCollection.PepperoniPizza;
import concreteProductCollection.VeggiePizza;

public class NewYorkPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		PizzaIngredientFactory newYorkPizzaInredientFactory = new NewYorkPizzaInredientFactory();
		Pizza pizza = null;
		
		switch (type) {
		case Pizza.CHEESE:
			pizza = new CheesePizza(newYorkPizzaInredientFactory);
			pizza.setName("NewYork CheesePizza");
			break;
		case Pizza.VEGGIE:
			pizza = new VeggiePizza(newYorkPizzaInredientFactory);
			pizza.setName("NewYork ViggiePizza");
			break;
		case Pizza.CLAM:
			pizza = new ClamPizza(newYorkPizzaInredientFactory);
			pizza.setName("NewYork ClamPizza");
			break;
		case Pizza.PEPPERONI:
			pizza = new PepperoniPizza(newYorkPizzaInredientFactory);
			pizza.setName("NewYork PepperoniPizza");
			break;
		}
		return pizza;
	}

}
