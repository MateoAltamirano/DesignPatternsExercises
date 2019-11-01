package observer;

public interface ISubject {
	public void suscribir(IObserver observer);

	public void detach(IObserver observer);

	public void notifyObserver();
}
