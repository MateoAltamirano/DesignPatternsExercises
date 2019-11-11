package bridge2;

public class CuentaPlazoFijo implements ICuenta {
	private IMoneda moneda;

	public CuentaPlazoFijo(IMoneda moneda) {
		this.moneda = moneda;
	}

	@Override
	public void datos() {
		System.out.print("Cuenta de Plazo Fijo, el interes es del 5% monto: ");
		this.moneda.monto();
		System.out.println(" Bs");
	}

}
