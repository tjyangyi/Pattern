package observer;

/**
 * ���۲��<br>
 * �κ��뱻�۲��Quackable������ʵ�ִ˽ӿ�<br>
 * 
 * @author YangYi
 *
 */
public interface QuackObservable {
	public void registerObserver(QuackObserver observer);
	public void notifyObservers();
}
