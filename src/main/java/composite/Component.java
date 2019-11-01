package composite;

public abstract class Component {
	private String nombre;
	private int estimacion;

	public Component(String nombre,int estimacion) {
		this.nombre = nombre;
		this.estimacion = estimacion;
		System.out.println("Constructor: " + nombre);
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstimacion() {
		return estimacion;
	}

	public void setEstimacion(int estimacion) {
		this.estimacion = estimacion;
	}

	

	public abstract void print();

	public abstract void add(Component component);

	public abstract void remove(Component component);

	public abstract void getChild(int position);
}
