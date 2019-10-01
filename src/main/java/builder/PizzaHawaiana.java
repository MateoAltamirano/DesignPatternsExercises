package builder;

public class PizzaHawaiana extends PizzaBuilder {

	@Override
	void buildMasa() {
		pizza.setMasa("c");

	}

	@Override
	void buildSalsa() {
		pizza.setSalsa("c");

	}

	@Override
	void buildTipoQueso() {
		pizza.setTipoQueso("c");

	}

}
