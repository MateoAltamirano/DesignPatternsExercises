package decorator;

public class TecladoGamer extends Decorator {
	private int precio;

	public TecladoGamer(IComputadora component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		this.precio = 10;
		System.out.println("Adding Teclado Gamer +" + precio);
		aumentarPrecio(precio);

	}

	@Override
	public void aumentarPrecio(int precio) {
		super.aumentarPrecio(precio);
	}
}
