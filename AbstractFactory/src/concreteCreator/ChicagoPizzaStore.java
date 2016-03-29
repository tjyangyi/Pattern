package concreteCreator;

import abstarctCreator.PizzaStore;
import abstractFacotry.PizzaIngredientFactory;
import abstractPorductCollection.Pizza;
import concreteFactory.ChicagoPizzaInredientFactory;
import concreteProductCollection.CheesePizza;
import concreteProductCollection.ClamPizza;
import concreteProductCollection.PepperoniPizza;
import concreteProductCollection.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaInredientFactory();

		switch (type) {
		case Pizza.CHEESE:
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("Chicago CheesePizza");
			break;
		case Pizza.VEGGIE:
			pizza = new VeggiePizza(pizzaIngredientFactory);
			pizza.setName("Chicago VeggiePizza");
			break;
		case Pizza.CLAM:
			pizza = new ClamPizza(pizzaIngredientFactory);
			pizza.setName("Chicago ClamPizza");
			break;
		case Pizza.PEPPERONI:
			pizza = new PepperoniPizza(pizzaIngredientFactory);
			pizza.setName("Chicago PepperoniPizza");
			break;
		}

		return pizza;
	}

}
