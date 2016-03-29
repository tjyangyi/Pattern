package subject;
import domain.Message;
import observer.Observer;


public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
	public void setMessage(Message message);
}
