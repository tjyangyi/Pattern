package observer;

/**
 * 被观察的<br>
 * 任何想被观察的Quackable都必须实现此接口<br>
 * 
 * @author YangYi
 *
 */
public interface QuackObservable {
	public void registerObserver(QuackObserver observer);
	public void notifyObservers();
}
