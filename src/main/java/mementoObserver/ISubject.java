package mementoObserver;

public interface ISubject {
	public void suscribir(IObserver observer);

	public void desuscribir(IObserver observer);

	public void notifyObserver();
}
