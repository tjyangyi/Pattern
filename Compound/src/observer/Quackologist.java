package observer;

public class Quackologist implements QuackObserver {

	@Override
	public void update(QuackObservable quackObservable) {
		System.out.println("鸭叫观察者,观察到了: " + quackObservable + " 叫了");
	}

}
