package concreteProduct;

import product.Pizza;

public class ChicagoVeggiePizza extends Pizza {
	public ChicagoVeggiePizza() {
		super.name = "Chicago Veggie 披萨";
		super.dough = "Chicago Veggie 面团";
		super.sauce = "Chicago Veggie 酱料";
		super.toppings.add("Chicago Veggie 作料1");
	}
}
