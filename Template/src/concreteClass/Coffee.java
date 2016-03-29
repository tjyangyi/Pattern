package concreteClass;

import abstractClass.Drink;

public class Coffee extends Drink {

	@Override
	protected void addCondiments() {
		System.out.println("Add Coffee Condiments");
	}

	@Override
	protected void brew() {
		System.out.println("Brew Coffee");
	}

}
