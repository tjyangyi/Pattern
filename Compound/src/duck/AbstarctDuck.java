package duck;

import observer.Observable;
import observer.QuackObserver;
import interfaces.Quackable;

public class AbstarctDuck implements Quackable {
	private Observable observable;

	public AbstarctDuck(){
		this.observable = new Observable(this);
	}
	@Override
	public void registerObserver(QuackObserver observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

	@Override
	public void quack() {
		this.notifyObservers();
	}

}
