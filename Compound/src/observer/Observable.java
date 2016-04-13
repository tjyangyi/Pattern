package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 辅助类<br>
 * 在其中封装注册和通知代码<br>
 * 然后把它和QuackObservable组合<br>
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
