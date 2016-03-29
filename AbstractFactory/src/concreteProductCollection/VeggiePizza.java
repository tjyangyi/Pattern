package concreteProductCollection;

import abstractFacotry.PizzaIngredientFactory;
import abstractPorductCollection.Pizza;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;

	public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("ÕýÔÚprepare:" + this.getName());
		this.dough = this.pizzaIngredientFactory.createDough();
		this.sauce = this.pizzaIngredientFactory.createSauce();
		this.veggie = this.pizzaIngredientFactory.createVeggie();

	}

}
