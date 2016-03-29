package concreteFactory;

import concreteProduct.ChicagoCheese;
import concreteProduct.ChicagoClam;
import concreteProduct.ChicagoDough;
import concreteProduct.ChicagoPepperoni;
import concreteProduct.ChicagoSauce;
import concreteProduct.ChicagoVeggie;
import abstractFacotry.PizzaIngredientFactory;
import abstractProduct.Cheese;
import abstractProduct.Clams;
import abstractProduct.Dough;
import abstractProduct.Pepperoni;
import abstractProduct.Sauce;
import abstractProduct.Veggie;

public class ChicagoPizzaInredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ChicagoDough();
	}

	@Override
	public Sauce createSauce() {
		return new ChicagoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ChicagoCheese();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new ChicagoPepperoni();
	}

	@Override
	public Clams createClam() {
		return new ChicagoClam();
	}

	@Override
	public Veggie createVeggie() {
		return new ChicagoVeggie();
	}

}
