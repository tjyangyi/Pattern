package component;

import interfaces.Quackable;

import java.util.ArrayList;
import java.util.List;

import observer.QuackObserver;

/**
 * ѼȺ
 * 
 * @author YangYi
 *
 */
public class Flock implements Quackable {

	private List<Quackable> quackers = new ArrayList<Quackable>();

	public void add(Quackable quackable) {
		quackers.add(quackable);
	}

	@Override
	public void quack() {
		for (Quackable quackable : quackers) {
			quackable.quack();
		}
	}

	@Override
	public void registerObserver(QuackObserver observer) {
		for (Quackable quackable : quackers) {
			quackable.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {
		for (Quackable quackable : quackers) {
			quackable.notifyObservers();
		}
	}

}
