package iterator;

public class Empleado {
	String nombre;
	int codigo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Empleado(String nombre, int codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
	}

}
