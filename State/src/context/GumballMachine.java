package context;

import concreteState.HasQuarterState;
import concreteState.NoQuarterState;
import concreteState.SoldOutState;
import concreteState.SoldState;
import concreteState.WinnerState;
import state.State;

public class GumballMachine {
	private State soldOutState;
	private State noQuarterState;
	private State hasQUarterState;
	private State soldState;
	private State winnerState;

	private State currentState = soldOutState;
	private int gumballCount = 0;

	public GumballMachine(int gumballCount) {
		this.gumballCount = gumballCount;
		this.soldOutState = new SoldOutState();
		this.noQuarterState = new NoQuarterState(this);
		this.hasQUarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
		this.winnerState = new WinnerState(this);
		if (this.gumballCount > 0) {
			this.currentState = noQuarterState;
		}
	}

	/**
	 * Ͷ��Ӳ��
	 */
	public void insertQuarter() {
		currentState.insertQuarter();
	}

	/**
	 * �˳�Ӳ��
	 */
	public void ejectQuarter() {
		currentState.ejectQuarter();
	}

	/**
	 * ת������
	 */
	public void turnCrank() {
		currentState.turnCrank();
		currentState.dispense();
	}

	public void setState(State state) {
		this.currentState = state;
	}

	public void releaseBall() {
		System.out.println("������ų���һ���ǹ�");
		if (this.gumballCount != 0) {
			gumballCount--;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQUarterState() {
		return hasQUarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public int getGumballCount() {
		return gumballCount;
	}

	public State getWinnerState() {
		return winnerState;
	}

}
