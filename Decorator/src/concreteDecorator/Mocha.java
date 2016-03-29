package concreteDecorator;

import component.Beverage;

import decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double getCost() {
		return this.beverage.getCost() + 0.2;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ",Mocha";
	}

}
