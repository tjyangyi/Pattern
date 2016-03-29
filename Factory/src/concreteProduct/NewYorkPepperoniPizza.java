package concreteProduct;

import product.Pizza;

public class NewYorkPepperoniPizza extends Pizza {
	public NewYorkPepperoniPizza() {
		super.name = "NewYork Pepperoni 披萨";
		super.dough = "NewYork Pepperoni 面团";
		super.sauce = "NewYork Pepperoni 酱料";
		super.toppings.add("NewYork Pepperoni 作料1");
	}
}
