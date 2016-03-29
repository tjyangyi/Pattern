package concreteCretor;

import product.Pizza;
import concreteProduct.ChicagoCheesePizza;
import concreteProduct.ChicagoClamPizza;
import concreteProduct.ChicagoPepperoniPizza;
import concreteProduct.ChicagoVeggiePizza;
import creator.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		switch (type) {
		case Pizza.cheese:
			return new ChicagoCheesePizza();
		case Pizza.veggie:
			return new ChicagoVeggiePizza();
		case Pizza.clam:
			return new ChicagoClamPizza();
		case Pizza.pepperoni:
			return new ChicagoPepperoniPizza();
		default:
			return null;
		}
	}

}
