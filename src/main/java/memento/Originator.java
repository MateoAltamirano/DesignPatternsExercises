package memento;

public class Originator {
	private Cambio state;

	public void commit(Cambio state) {
		System.out.println("Originator: Setting commit to " + state.getCambio());
		state.show();
		this.state = state;
	}

	public Memento createMemento() {
		System.out.println("Originator: Create Memento.");
		state.show();
		return new Memento(state);
	}

	public void restoreCommit(Memento m) {
		state = m.getSavedState();
		System.out.println("Originator: State after restoring from Memento: " + state.getCambio());
		state.show();
	}
}
