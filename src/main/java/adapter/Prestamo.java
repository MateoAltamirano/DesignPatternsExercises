package adapter;

public class Prestamo implements Cloneable {
	private static final Prestamo instance = new Prestamo();
	private int fondos;

	public int getFondos() {
		return fondos;
	}

	public void setFondos(int fondos) {
		this.fondos = fondos;
	}

	private Prestamo() {
		System.out.println("Creating singleton3");
	}

	public static synchronized Prestamo getUniqueInstance() {
		return instance;
	}

	public void myInstance() {
		System.out.println("Using singleton");
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public void realizarPrestamo(int monto) {
		if (getFondos() - monto >= 0) {
			setFondos(getFondos() - monto);
		} else {
			System.out.println("No se puede realizar el prestamo");
		}
	}
}
