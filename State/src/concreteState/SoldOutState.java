package concreteState;

import state.State;

public class SoldOutState implements State {

	@Override
	public void insertQuarter() {
		System.out.println("�ǹ�������");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("�ǹ�������");
	}

	@Override
	public void turnCrank() {
		System.out.println("�ǹ�������");
	}

	@Override
	public void dispense() {
		System.out.println("�ǹ�������");
	}

}
