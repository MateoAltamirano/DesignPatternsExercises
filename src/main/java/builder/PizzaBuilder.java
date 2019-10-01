package builder;

public abstract class PizzaBuilder {
	protected Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	void createPizza() {
		pizza = new Pizza();
	}

	abstract void buildMasa();

	abstract void buildSalsa();

	abstract void buildTipoQueso();
}
