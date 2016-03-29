package concreteProduct;

import product.Pizza;

public class NewYorkClamPizza extends Pizza {
	public NewYorkClamPizza() {
		super.name = "NewYork Clam 披萨";
		super.dough = "NewYork Clam 面团";
		super.sauce = "NewYork Clam 酱料";
		super.toppings.add("NewYork Clam 作料1");
	}
}
