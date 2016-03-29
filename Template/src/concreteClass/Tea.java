package concreteClass;

import abstractClass.Drink;

public class Tea extends Drink {
	private boolean wantsCondiments;
	
	public Tea(boolean wantsCondiments){
		this.wantsCondiments = wantsCondiments;
	}

	@Override
	protected void addCondiments() {
		System.out.println("Add Tea Condiments");
	}

	@Override
	protected void brew() {
		System.out.println("Brew Tea");
	}

	@Override
	protected boolean isCustomerWantsCondiments() {
		return this.wantsCondiments;
	}

}
