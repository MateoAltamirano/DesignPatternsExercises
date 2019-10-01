package abstractAndSingleton;

public class Creditos implements ICajero {

	@Override
	public void prestamo(int monto) {
		CuentaPrincipal.getUniqueInstance().prestamo(monto);
		
	}

	@Override
	public void deposito(int monto) {
		CuentaPrincipal.getUniqueInstance().depositar(monto);
		
	}

}
