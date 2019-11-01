package decorator;

public class MonitorSamsung extends Decorator {
	private int precio;

	public MonitorSamsung(IComputadora component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		this.precio = 50;
		System.out.println("Adding Monitor Samsung +" + precio);
		aumentarPrecio(precio);

	}

	@Override
	public void aumentarPrecio(int precio) {
		super.aumentarPrecio(precio);
	}
}
