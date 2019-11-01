package cine;

public class ComboMedianoBuilder extends ComboBuilder {

	@Override
	public void buildGaseosas() {
		combo.setGaseosas("2 medianas");

	}

	@Override
	public void buildPipocas() {
		combo.setPipoca("Mediana");
	}

	@Override
	public void buildChocolates() {
		combo.setChocolates(0);
	}

	@Override
	public void buildPrecio() {
		combo.setPrecio(30);
	}

}
