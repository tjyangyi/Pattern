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
		System.out.println("��ȴ�,���ڳ��ǹ�,��ʱ��ҪͶ��");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("�Ѿ�ת���������޷���Ӳ��");
	}

	@Override
	public void turnCrank() {
		System.out.println("�Ѿ�ת�������������ڳ��ǹ�");
	}

	@Override
	public void dispense() {
		this.gumballMachine.releaseBall();
		if (this.gumballMachine.getGumballCount() > 0) {
			this.gumballMachine.setState(this.gumballMachine
					.getNoQuarterState());
		} else {
			System.out.println("�ǹ��Ѿ�û��");
			this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
		}
	}

}
