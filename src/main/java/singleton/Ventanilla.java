package singleton;

public class Ventanilla implements Cloneable {
	private static final Ventanilla instance = new Ventanilla();
	private int dinero;

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	private Ventanilla() {
		System.out.println("Creating ventanilla");
	}

	public static synchronized Ventanilla getUniqueInstance() {
		return instance;
	}

	public void pagar(int monto) {
		System.out.println("Pagando Bs: " + monto + " en la ventanilla " + this.hashCode());
		monto += dinero;
		setDinero(monto);
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public void ingresarCodigo(int codigo) {
		System.out.println("Ingresando con el codigo: " + codigo);

	}
}
