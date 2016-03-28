package concreteState;

import state.State;

public class SoldOutState implements State {

	@Override
	public void insertQuarter() {
		System.out.println("糖果已售罄");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("糖果已售罄");
	}

	@Override
	public void turnCrank() {
		System.out.println("糖果已售罄");
	}

	@Override
	public void dispense() {
		System.out.println("糖果已售罄");
	}

}
