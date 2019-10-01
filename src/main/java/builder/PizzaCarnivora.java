package builder;

public class PizzaCarnivora extends PizzaBuilder {

	@Override
	void buildMasa() {
		pizza.setMasa("h");

	}

	@Override
	void buildSalsa() {
		pizza.setSalsa("h");

	}

	@Override
	void buildTipoQueso() {
		pizza.setTipoQueso("h");

	}

}
