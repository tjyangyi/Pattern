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
		System.out.println("һ��ֻ��Ͷһ��Ӳ��");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("����Ӳ��");
		this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("ת��������");
		if (this.random.nextInt(10) == 0
				&& (this.gumballMachine.getGumballCount() > 1)) {
			this.gumballMachine.setState(this.gumballMachine.getWinnerState());
		} else {
			this.gumballMachine.setState(this.gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("����ֱ�ӳ��ǹ�,��ת������");

	}

}
