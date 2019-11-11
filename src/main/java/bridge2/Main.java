package bridge2;

public class Main {

	public static void main(String[] args) {
		Bolivianos bolivianos = new Bolivianos();
		bolivianos.setMonto(100);
		CuentaAhorros cuentaAhorros = new CuentaAhorros(bolivianos);
		cuentaAhorros.datos();
		
		Dolares dolares = new Dolares();
		dolares.setMonto(100);
		CuentaPlazoFijo cuentaPlazoFijo = new CuentaPlazoFijo(dolares);
		cuentaPlazoFijo.datos();
		
		Euro euros = new Euro();
		euros.setMonto(100);
		CuentaCredito cuentaCredito = new CuentaCredito(euros);
		cuentaCredito.datos();
	}

}
