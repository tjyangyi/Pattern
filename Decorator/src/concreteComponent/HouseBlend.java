package concreteComponent;

import component.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		super.description = "HouseBlend";// ���
	}

	@Override
	public double getCost() {
		return 0.89;
	}

}
