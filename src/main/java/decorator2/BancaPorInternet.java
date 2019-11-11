package decorator2;

public class BancaPorInternet extends Decorator {
	private boolean enable;

	public BancaPorInternet(ICuenta component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		enable = true;
		System.out.println("Adding Banca Por Internet");
		aumentarFuncionalidad(enable, false,false,0);
	}

	@Override
	public void aumentarFuncionalidad(boolean internet, boolean promocion,boolean seguro, int monto) {
		super.aumentarFuncionalidad(internet, promocion, seguro,monto);
	}
	
	
}
