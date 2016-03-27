package concreteState;

import context.GumballMachine;
import state.State;

public class SoldOutState implements State {
	private GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

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
