package builder;

public class Cocinero {
	private PizzaBuilder pizzaBuilder;

	public void setPizzaBuilder(PizzaBuilder builder) {
		pizzaBuilder = builder;
	}

	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

	public void buildPizza() {
		pizzaBuilder.createPizza();
		pizzaBuilder.buildMasa();
		pizzaBuilder.buildSalsa();
		pizzaBuilder.buildTipoQueso();
	}
}
