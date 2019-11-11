package bridge2;

public class CuentaCredito implements ICuenta {
	private IMoneda moneda;

	public CuentaCredito(IMoneda moneda) {
		this.moneda = moneda;
	}

	@Override
	public void datos() {
		System.out.print("Cuenta de Credito, monto: ");
		this.moneda.monto();
		System.out.println(" Bs");
	}

}
