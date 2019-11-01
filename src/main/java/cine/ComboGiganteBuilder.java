package cine;

public class ComboGiganteBuilder extends ComboBuilder {

	@Override
	public void buildGaseosas() {
		combo.setGaseosas("2 grandes");

	}

	@Override
	public void buildPipocas() {
		combo.setPipoca("Gigante");
	}

	@Override
	public void buildChocolates() {
		combo.setChocolates(2);
	}

	@Override
	public void buildPrecio() {
		combo.setPrecio(50);
	}

}
