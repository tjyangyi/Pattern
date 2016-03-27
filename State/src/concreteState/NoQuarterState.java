package concreteState;

import state.State;
import context.GumballMachine;

public class NoQuarterState implements State {
	private GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("你投入一次硬币");
		this.gumballMachine.setState(this.gumballMachine.getHasQUarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("没有投币,没有硬币退");
	}

	@Override
	public void turnCrank() {
		System.out.println("请先投入硬币");
	}

	@Override
	public void dispense() {
		System.out.println("请先投入硬币");
	}

}
