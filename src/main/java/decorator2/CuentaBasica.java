package decorator2;

public class CuentaBasica implements ICuenta {
	private int monto;
	private String nombrePropietario;

	public CuentaBasica(int monto, String nombrePropietario) {
		this.monto = monto;
		this.nombrePropietario = nombrePropietario;
	}

	@Override
	public void operation() {
		System.out.println("Cuenta Basica creada");
	}

	@Override
	public void aumentarFuncionalidad(boolean internet, boolean promocion, boolean seguro,int monto) {
		if (internet) {
			System.out.println("Su cuenta ahora tiene el servicio de banca por internet");
		} else if (promocion && monto % 2 == 0) {
			this.monto *= 2;
			System.out.println("Felicidades " + nombrePropietario + "! , sus fondos fueron duplicados");
			System.out.println("Fondos: " + this.monto);
		} else if(seguro){
			this.monto -= monto;
			System.out.println("Su cuenta ahora tiene seguro, sus fondos son: " + this.monto);
		}
	}

}
