package concreteProduct;

import product.Pizza;

public class ChicagoPepperoniPizza extends Pizza {

	public ChicagoPepperoniPizza() {
		super.name = "Chicago Pepperoni 披萨";
		super.dough = "Chicago Pepperoni 面团";
		super.sauce = "Chicago Pepperoni 酱料";
		super.toppings.add("Chicago Pepperoni 作料1");
	}
}
