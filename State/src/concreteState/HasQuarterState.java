package concreteState;

import context.GumballMachine;
import state.State;

public class HasQuarterState implements State {
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
		this.gumballMachine.setState(this.gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		System.out.println("����ֱ�ӳ��ǹ�,��ת������");

	}

}
