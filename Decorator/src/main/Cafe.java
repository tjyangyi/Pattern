package main;

import component.Beverage;
import concreteComponent.Espresso;
import concreteComponent.HouseBlend;
import concreteDecorator.Mocha;
import concreteDecorator.Soy;

public class Cafe {
	public static void main(String args[]){
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + "  " + espresso.getCost());
		
		Beverage houseBlend = new HouseBlend();
		houseBlend = new  Mocha(houseBlend);
		houseBlend = new  Mocha(houseBlend);
		houseBlend = new  Soy(houseBlend);
		System.out.println(houseBlend.getDescription() + "  " + houseBlend.getCost());
	}
}
