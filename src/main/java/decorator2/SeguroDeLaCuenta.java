package decorator2;

public class SeguroDeLaCuenta extends Decorator {
	private int monto;

	public SeguroDeLaCuenta(ICuenta component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		monto = 10;
		System.out.println("Adding Seguro de la Cuenta");
		aumentarFuncionalidad(false, false, true, monto);
	}

	@Override
	public void aumentarFuncionalidad(boolean internet, boolean promocion, boolean seguro, int monto) {
		super.aumentarFuncionalidad(internet, promocion, seguro, monto);
	}

}
