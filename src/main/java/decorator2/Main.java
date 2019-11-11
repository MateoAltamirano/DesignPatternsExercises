package decorator2;

public class Main {

	public static void main(String[] args) {
		ICuenta cuentaBasica = new CuentaBasica(100,"Mateo Altamirano");
		cuentaBasica = new BancaPorInternet(cuentaBasica);
		cuentaBasica = new SeguroDeLaCuenta(cuentaBasica);
		cuentaBasica = new Promocion(cuentaBasica);
		cuentaBasica.operation();
	}

}
