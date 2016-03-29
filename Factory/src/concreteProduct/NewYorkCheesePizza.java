package concreteProduct;

import product.Pizza;

public class NewYorkCheesePizza extends Pizza{
	public NewYorkCheesePizza() {
		super.name = "NewYork Cheese 披萨";
		super.dough = "NewYork Cheese 面团";
		super.sauce = "NewYork Cheese 酱料";
		super.toppings.add("NewYork Cheese 作料1");
	}
}
