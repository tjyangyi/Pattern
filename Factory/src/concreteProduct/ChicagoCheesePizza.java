package concreteProduct;

import product.Pizza;

public class ChicagoCheesePizza extends Pizza {
	@Override
	public void cut() {
		System.out.println("切成正方形");
	}

	public ChicagoCheesePizza() {
		super.name = "Chicago Cheese 披萨";
		super.dough = "Chicago Cheese 面团";
		super.sauce = "Chicago Cheese 酱料";
		super.toppings.add("Chicago Cheese 作料1");
	}

}
