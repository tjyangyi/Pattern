package concreteProduct;

import product.Pizza;

public class ChicagoCheesePizza extends Pizza {
	@Override
	public void cut() {
		System.out.println("�г�������");
	}

	public ChicagoCheesePizza() {
		super.name = "Chicago Cheese ����";
		super.dough = "Chicago Cheese ����";
		super.sauce = "Chicago Cheese ����";
		super.toppings.add("Chicago Cheese ����1");
	}

}
