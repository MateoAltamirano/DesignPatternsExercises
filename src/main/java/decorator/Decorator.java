package decorator;

public abstract class Decorator implements IComputadora {
	private IComputadora component;

	public Decorator(IComputadora component) {
		this.component = component;
	}

	public void operation() {
		component.operation();
	}
	public void aumentarPrecio(int precio) {
		component.aumentarPrecio(precio);
	}
}
