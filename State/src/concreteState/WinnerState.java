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
		System.out.println("��ʱ����Ͷ��Ӳ��");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("��ʱ�޷��˳�Ӳ��");
	}

	@Override
	public void turnCrank() {
		System.out.println("�Ѿ�ת��������");
	}

	@Override
	public void dispense() {
		System.out.println("�������ܺã���������ǹ�");
		this.gumballMachine.releaseBall();
		if (this.gumballMachine.getGumballCount() == 0) {
			this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
		} else {
			this.gumballMachine.releaseBall();
			if (this.gumballMachine.getGumballCount() == 0) {
				System.out.println("û�ǹ���");
				this.gumballMachine.setState(this.gumballMachine
						.getSoldOutState());
			} else {
				this.gumballMachine.setState(this.gumballMachine
						.getNoQuarterState());
			}
		}
	}

}
