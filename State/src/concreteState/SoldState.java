package concreteState;

import context.GumballMachine;
import state.State;

public class SoldState implements State {
	private GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("请等待,正在出糖果,此时不要投币");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("已经转动曲柄，无法退硬币");
	}

	@Override
	public void turnCrank() {
		System.out.println("已经转动过曲柄，正在出糖果");
	}

	@Override
	public void dispense() {
		this.gumballMachine.releaseBall();
		if (this.gumballMachine.getGumballCount() > 0) {
			this.gumballMachine.setState(this.gumballMachine
					.getNoQuarterState());
		} else {
			System.out.println("糖果已经没了");
			this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
		}
	}

}
