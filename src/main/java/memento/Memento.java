package memento;

public class Memento {
	private Cambio state;

	public Memento(Cambio stateTosave) {
		this.state = stateTosave;
	}

	public Cambio getSavedState() {
		return state;
	}
}
