package concreteProductCollection;

import abstractFacotry.PizzaIngredientFactory;
import abstractPorductCollection.Pizza;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;

	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("ÕýÔÚprepare:" + this.getName());
		this.dough = this.pizzaIngredientFactory.createDough();
		this.sauce = this.pizzaIngredientFactory.createSauce();
		this.cheese = this.pizzaIngredientFactory.createCheese();
	}

}
