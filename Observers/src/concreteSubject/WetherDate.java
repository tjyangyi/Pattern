package concreteSubject;
import java.util.ArrayList;

import domain.Message;
import observer.Observer;
import subject.Subject;

public class WetherDate implements Subject {
	private ArrayList<Observer> observers;
	private Message message;

	public WetherDate() {
		super();
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(message);
		}
	}

	private void valueChanged() {
		this.notifyObservers();
	}

	@Override
	public void setMessage(Message message) {
		this.message = message;
		this.valueChanged();
	}

}
