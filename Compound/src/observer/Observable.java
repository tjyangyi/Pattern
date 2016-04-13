package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ������<br>
 * �����з�װע���֪ͨ����<br>
 * Ȼ�������QuackObservable���<br>
 * 
 * @author YangYi
 *
 */
public class Observable implements QuackObservable {
	List<QuackObserver> observers = new ArrayList<QuackObserver>();
	QuackObservable quackObservable;

	public Observable(QuackObservable quackObservable) {
		this.quackObservable = quackObservable;
	}

	@Override
	public void registerObserver(QuackObserver observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		for(QuackObserver observer:observers){
			observer.update(quackObservable);
		}
	}

}
