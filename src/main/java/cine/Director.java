package cine;

public class Director {
	private ComboBuilder comboBuilder;

	public void setComboBuilder(ComboBuilder builder) {
		comboBuilder = builder;
	}

	public Combos getProduct() {
		return comboBuilder.getCombo();
	}

	public void buildProduct() {
		comboBuilder.createCombo();
		comboBuilder.buildGaseosas();
		comboBuilder.buildChocolates();
		comboBuilder.buildPipocas();
		comboBuilder.buildPrecio();
	}
}
