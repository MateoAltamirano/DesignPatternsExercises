package proxy2;

public class ServidorOficial implements IServidor {
	String attribute;

	public ServidorOficial(String attribute) {
		this.attribute = attribute;
	}

	@Override
	public void request(Peticion peticion) {
		if (peticion == Peticion.Carga) {
			System.out.println("Cargando " + attribute + " al servidor oficial");
		} else {
			System.out.println("Descargando " + attribute + " del servidor oficial");

		}
	}

}
