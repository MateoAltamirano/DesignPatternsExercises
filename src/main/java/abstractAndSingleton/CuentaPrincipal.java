package abstractAndSingleton;

public class CuentaPrincipal implements Cloneable {
	private static final CuentaPrincipal instance = new CuentaPrincipal();
	public int fondos;

	public int getFondos() {
		return fondos;
	}

	public void setFondos(int fondos) {
		this.fondos = fondos;
	}

	private CuentaPrincipal() {
		//this.fondos = fondos;
		System.out.println("creating cuenta principal");
	}

	public static synchronized CuentaPrincipal getUniqueInstance() {
		return instance;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public void prestamo(int monto) {
		setFondos(getFondos() - monto);
		System.out.println(
				"Realizando prestamo de Bs: " + monto + ". la cuenta queda con Bs: " + getFondos() + " en "+this.hashCode());
	}

	public void depositar(int monto) {
		setFondos(getFondos()+monto);
		//this.fondos += monto;
		System.out.println("Depositando Bs: " + monto + ", la cuenta queda con Bs: " + getFondos() + " en "+this.hashCode());
	}
}
