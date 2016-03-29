package concreteFactory;

import concreteProduct.NewYorkCheese;
import concreteProduct.NewYorkClam;
import concreteProduct.NewYorkDough;
import concreteProduct.NewYorkPepperoni;
import concreteProduct.NewYorkSauce;
import concreteProduct.NewYorkVeggie;
import abstractFacotry.PizzaIngredientFactory;
import abstractProduct.Cheese;
import abstractProduct.Clams;
import abstractProduct.Dough;
import abstractProduct.Pepperoni;
import abstractProduct.Sauce;
import abstractProduct.Veggie;

public class NewYorkPizzaInredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new NewYorkDough();
	}

	@Override
	public Sauce createSauce() {
		return new NewYorkSauce();
	}

	@Override
	public Cheese createCheese() {
		return new NewYorkCheese();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new NewYorkPepperoni();
	}

	@Override
	public Clams createClam() {
		return new NewYorkClam();
	}

	@Override
	public Veggie createVeggie() {
		return new NewYorkVeggie();
	}

}
