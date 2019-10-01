package factoryMethod;


public class MainKit {
	public static void main(String[] args) {
		KitEscolar escolar = new ConcreteEscolarCreator().factorymethodProduct();
		KitColegial colegial = new ConcreteColegialCreator().factorymethodProduct();

	}
}
