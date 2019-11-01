package decorator;

public class Computadora implements IComputadora {
	private int precio =100;

	@Override
	public void operation() {
		System.out.println("Operation Computadora");
		System.out.println("Precio computadora: "+precio);
		System.out.println();
	}

	@Override
	public void aumentarPrecio(int precioComponente) {
		precio+=precioComponente;
		System.out.println("Precio computadora: "+precio);
		System.out.println();
	}
}
