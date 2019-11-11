package composite2;

public abstract class Component {
	private int precio;
	private String nombre;

	public Component(String nombre, int precio) {
		this.precio = precio;
		this.nombre = nombre;
		System.out.println("Constructor " + nombre);
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract void print();

	public abstract void add(Component component);

	public abstract void remove(Component component);

	public abstract void getChild(int position);
}
