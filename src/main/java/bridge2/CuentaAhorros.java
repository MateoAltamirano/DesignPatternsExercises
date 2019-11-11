package bridge2;

public class CuentaAhorros implements ICuenta {
	private IMoneda moneda;

	public CuentaAhorros(IMoneda moneda) {
		this.moneda = moneda;
	}

	@Override
	public void datos() {
		System.out.print("Cuenta de Ahorros, el interes es del 2%, monto: ");
		this.moneda.monto();
		System.out.println(" Bs");
	}
}
