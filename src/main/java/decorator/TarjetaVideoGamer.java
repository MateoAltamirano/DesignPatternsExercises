package decorator;

public class TarjetaVideoGamer extends Decorator {
	private int precio;

	public TarjetaVideoGamer(IComputadora component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		this.precio = 25;
		System.out.println("Adding Tarjeta de Video Gamer +" + precio);
		aumentarPrecio(precio);

	}

	@Override
	public void aumentarPrecio(int precio) {
		super.aumentarPrecio(precio);
	}

}
