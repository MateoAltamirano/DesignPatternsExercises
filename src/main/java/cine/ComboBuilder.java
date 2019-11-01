package cine;

public abstract class ComboBuilder {
	protected Combos combo;

	public Combos getCombo() {
		return combo;
	}

	public void createCombo() {
		combo = new Combos();
	}

	public abstract void buildGaseosas();

	public abstract void buildPipocas();

	public abstract void buildChocolates();

	public abstract void buildPrecio();
}
