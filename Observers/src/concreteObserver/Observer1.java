package concreteObserver;
import interfac.DisplayElement;
import domain.Message;
import observer.Observer;
import subject.Subject;

public class Observer1 implements Observer, DisplayElement {
	private Message message;
	private Subject subject;

	public Observer1(Subject subject) {
		super();
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println(message.toString());
	}

	@Override
	public void update(Message message) {
		this.message = message;
		this.display();
	}
	
	@Override
	public void quitFromSubject(){
		this.subject.removeObserver(this);
	}

}
