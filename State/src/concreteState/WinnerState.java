package concreteState;

import context.GumballMachine;
import state.State;

public class WinnerState implements State {
	private GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("此时不能投入硬币");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("此时无法退出硬币");
	}

	@Override
	public void turnCrank() {
		System.out.println("已经转动过曲柄");
	}

	@Override
	public void dispense() {
		System.out.println("你运气很好，获得两个糖果");
		this.gumballMachine.releaseBall();
		if (this.gumballMachine.getGumballCount() == 0) {
			this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
		} else {
			this.gumballMachine.releaseBall();
			if (this.gumballMachine.getGumballCount() == 0) {
				System.out.println("没糖果了");
				this.gumballMachine.setState(this.gumballMachine
						.getSoldOutState());
			} else {
				this.gumballMachine.setState(this.gumballMachine
						.getNoQuarterState());
			}
		}
	}

}
