package mementoObserver;

import java.util.ArrayList;

public class Repositorio implements ISubject {
	private Cambio cambio;
	private ArrayList<IObserver> observadores = new ArrayList<>();

	public void commit(Cambio cambio) {
		System.out.println("Repositorio: Setting commit to " + cambio.getCambio());
		cambio.show();
		this.cambio = cambio;
		this.notifyObserver();
	}

	public Memento createMemento() {
		System.out.println("Repositorio: Create Memento.");
		cambio.show();
		return new Memento(cambio);
	}

	public void restoreCommit(Memento m) {
		cambio = m.getSavedState();
		System.out.println("Repositorio: State after restoring from Memento: " + cambio.getCambio());
		cambio.show();
		notifyObserver();
	}

	@Override
	public void desuscribir(IObserver observer) {
		observadores.remove(observer);
	}

	@Override
	public void suscribir(IObserver observer) {
		observadores.add(observer);
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observadores.size(); i++) {
			observadores.get(i).update(cambio);
		}
	}
}
