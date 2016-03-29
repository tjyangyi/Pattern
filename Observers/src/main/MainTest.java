package main;
import observer.Observer;
import concreteObserver.Observer1;
import concreteSubject.WetherDate;
import domain.Message;
import subject.Subject;


public class MainTest {

	public static void main(String[] args) {
		Subject wetherDate = new WetherDate();
		Observer observer1 = new Observer1(wetherDate);
		wetherDate.setMessage(new Message(10.1f,12f,13f));
		wetherDate.setMessage(new Message(23.1f,342f,13f));
		observer1.quitFromSubject();
	}

}
