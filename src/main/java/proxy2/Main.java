package proxy2;

public class Main {

	public static void main(String[] args) {
		IServidor proxy = new Proxy("123.zip");
		proxy.request(Peticion.Carga);
		proxy.request(Peticion.Descarga);
		
		IServidor proxy2 = new Proxy("Mateo.doc");
		proxy2.request(Peticion.Carga);
	}

}
