package concreteDecorator;

import component.Beverage;

import decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ",Soy";
	}

	@Override
	public double getCost() {
		return this.beverage.getCost() + 0.15;
	}

}
