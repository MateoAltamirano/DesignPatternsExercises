package decorator;

public class MouseGamer extends Decorator {
	private int precio;

	public MouseGamer(IComputadora component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		this.precio = 15;
		System.out.println("Adding Mouse Gamer +" + precio);
		aumentarPrecio(precio);

	}

	@Override
	public void aumentarPrecio(int precio) {
		super.aumentarPrecio(precio);
	}

}
