package concreteProduct;

import product.Pizza;

public class ChicagoClamPizza extends Pizza {

	public ChicagoClamPizza() {
		super.name = "Chicago Clam 披萨";
		super.dough = "Chicago Clam 面团";
		super.sauce = "Chicago Clam 酱料";
		super.toppings.add("Chicago Clam 作料1");
	}
}
