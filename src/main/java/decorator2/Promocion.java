package decorator2;

import java.util.Random;

public class Promocion extends Decorator {
	private int sorteo;

	public Promocion(ICuenta component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		Random rand = new Random();
		sorteo = rand.nextInt(100);
		System.out.println("Participando en Promocion...");
		aumentarFuncionalidad(false, true, false,sorteo);
	}

	@Override
	public void aumentarFuncionalidad(boolean internet, boolean promocion,boolean seguro, int monto) {
		super.aumentarFuncionalidad(internet, promocion,seguro, monto);
	}

}
