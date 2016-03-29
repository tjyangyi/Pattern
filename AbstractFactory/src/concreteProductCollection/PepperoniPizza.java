package concreteProductCollection;

import abstractFacotry.PizzaIngredientFactory;
import abstractPorductCollection.Pizza;

public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;

	public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("ÕýÔÚprepare:" + this.getName());
		this.dough = this.pizzaIngredientFactory.createDough();
		this.sauce = this.pizzaIngredientFactory.createSauce();
		this.pepperoni = this.pizzaIngredientFactory.createPepperoni();
	}

}
