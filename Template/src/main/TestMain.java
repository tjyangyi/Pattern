package main;

import concreteClass.Coffee;
import concreteClass.Tea;

public class TestMain {
	public static void main(String args[]) {
		Coffee coffee = new Coffee();
		Tea tea = new Tea(false);
		
		coffee.prepare();
		tea.prepare();
	}
}
