package observer;
import domain.Message;


public interface Observer {
	public void update(Message message);

	public abstract void quitFromSubject();
}
