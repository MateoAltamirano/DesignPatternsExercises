package factoryMethod;

public class ConcreteColegialCreator extends ColegialCreator {

	@Override
	public KitColegial factorymethodProduct() {
		System.out.println("Kit Colegial");
		KitColegial concreteKit = new KitColegial(new Mochila(5, 5), new Libros("lenguaje", "mateo"),
				new Computadora("Huawei", "Windows"));
		return concreteKit;
	}

}
