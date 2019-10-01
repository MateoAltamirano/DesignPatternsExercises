package builder;

public class Client {

	public static void main(String[] args) {
		Cocinero director = new Cocinero();
		PizzaBuilder hawaiana = new PizzaHawaiana();
		PizzaBuilder carnivora = new PizzaCarnivora();

		director.setPizzaBuilder(hawaiana);
		director.buildPizza();
		Pizza ph = director.getPizza();

		director.setPizzaBuilder(carnivora);
		director.buildPizza();
		Pizza pc = director.getPizza();

		System.out.println(ph.getMasa() + " " + ph.getSalsa() + " " + ph.getTipoQueso());
		System.out.println(pc.getMasa() + " " + pc.getSalsa() + " " + pc.getTipoQueso());
	}

}
