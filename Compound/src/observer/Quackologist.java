package observer;

public class Quackologist implements QuackObserver {

	@Override
	public void update(QuackObservable quackObservable) {
		System.out.println("Ѽ�й۲���,�۲쵽��: " + quackObservable + " ����");
	}

}
