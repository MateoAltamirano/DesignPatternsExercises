package factoryMethod;

public class ConcreteEscolarCreator extends EscolarCreator {

	@Override
	public KitEscolar factorymethodProduct() {
		System.out.println("Kit Escolar");
		KitEscolar concreteKit = new KitEscolar(new Mochila(5, 5), new Deportivo(4, "rojo", 2),
				new Cuadernos("carta", 100));
		return concreteKit;
	}

}
