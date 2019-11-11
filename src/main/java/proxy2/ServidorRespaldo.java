package proxy2;

public class ServidorRespaldo implements IServidor {
	String attribute;

	public ServidorRespaldo(String attribute) {
		this.attribute = attribute;
	}

	@Override
	public void request(Peticion peticion) {
		if (peticion == Peticion.Carga) {
			System.out.println("Cargando " + attribute + " al servidor de respaldo");
		} else {
			System.out.println("Descargando " + attribute + " del servidor de respaldo");

		}
	}

}
