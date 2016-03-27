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
		System.out.println("��Ͷ��һ��Ӳ��");
		this.gumballMachine.setState(this.gumballMachine.getHasQUarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("û��Ͷ��,û��Ӳ����");
	}

	@Override
	public void turnCrank() {
		System.out.println("����Ͷ��Ӳ��");
	}

	@Override
	public void dispense() {
		System.out.println("����Ͷ��Ӳ��");
	}

}
