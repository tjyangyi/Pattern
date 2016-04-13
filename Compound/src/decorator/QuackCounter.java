package decorator;

import interfaces.Quackable;
import observer.QuackObserver;

/**
 * 鸭子叫声计数器<br>
 * 装饰者<br>
 * 实现同样的接口，赋予一些新行为<br>
 * 
 * @author YangYi
 *
 */
public class QuackCounter implements Quackable {
	private Quackable quackable;
	private static int numberOfQuacks;

	public QuackCounter(Quackable quackable) {
		this.quackable = quackable;
	}

	@Override
	public void quack() {
		this.quackable.quack();
		QuackCounter.numberOfQuacks++;
	}

	public static int getQuackNumber() {
		return QuackCounter.numberOfQuacks;
	}

	@Override
	public void registerObserver(QuackObserver observer) {
		this.quackable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		this.quackable.notifyObservers();
	}

}
