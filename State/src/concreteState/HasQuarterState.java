package concreteState;

import java.util.Random;

import context.GumballMachine;
import state.State;

public class HasQuarterState implements State {
	private Random random = new Random();
	private GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("一次只能投一个硬币");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("返还硬币");
		this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("转动了曲柄");
		if (this.random.nextInt(10) == 0
				&& (this.gumballMachine.getGumballCount() > 1)) {
			this.gumballMachine.setState(this.gumballMachine.getWinnerState());
		} else {
			this.gumballMachine.setState(this.gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("不能直接出糖果,请转动曲柄");

	}

}
