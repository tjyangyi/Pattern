package concreteCretor;

import concreteProduct.NewYorkCheesePizza;
import concreteProduct.NewYorkClamPizza;
import concreteProduct.NewYorkPepperoniPizza;
import concreteProduct.NewYorkVeggiePizza;
import product.Pizza;
import creator.PizzaStore;

public class NewYorkPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		switch (type) {
		case Pizza.cheese:
			return new NewYorkCheesePizza();
		case Pizza.veggie:
			return new NewYorkVeggiePizza();
		case Pizza.clam:
			return new NewYorkClamPizza();
		case Pizza.pepperoni:
			return new NewYorkPepperoniPizza();
		default:
			return null;
		}
	}

}
