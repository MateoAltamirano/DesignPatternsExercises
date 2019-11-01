package cine;

public class ComboPequeñoBuilder extends ComboBuilder {

	@Override
	public void buildGaseosas() {
		combo.setGaseosas("1 pequeña");

	}

	@Override
	public void buildPipocas() {
		combo.setPipoca("Economica");
	}

	@Override
	public void buildChocolates() {
		combo.setChocolates(0);
	}

	@Override
	public void buildPrecio() {
		combo.setPrecio(15);
	}

}
