package concreteProduct;

import product.Pizza;

public class NewYorkVeggiePizza extends Pizza{
	public NewYorkVeggiePizza() {
		super.name = "NewYork Veggie 披萨";
		super.dough = "NewYork Veggie 面团";
		super.sauce = "NewYork Veggie 酱料";
		super.toppings.add("NewYork Veggie 作料1");
	}
}
