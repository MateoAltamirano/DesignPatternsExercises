package decorator2;

public abstract class Decorator implements ICuenta {
	private ICuenta cuenta;

	public Decorator(ICuenta cuenta) {
		this.cuenta = cuenta;
	}

	public void operation() {
		cuenta.operation();
	}

	public void aumentarFuncionalidad(boolean internet,boolean promocion,boolean seguro,int monto) {
		cuenta.aumentarFuncionalidad(internet, promocion, seguro,monto);
	}
}
