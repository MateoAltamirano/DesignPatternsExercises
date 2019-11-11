package proxy2;

public class Proxy implements IServidor {
	private String archivo;
	private ServidorOficial servidorOficial = null;
	private ServidorRespaldo servidorRespaldo = null;

	public Proxy(String attribute1) {
		this.archivo = attribute1;

	}

	@Override
	public void request(Peticion peticion) {
		if (servidorOficial == null) {
			servidorOficial = new ServidorOficial(archivo);
			servidorRespaldo = new ServidorRespaldo(archivo);

		}
		if (archivo.contains(".zip")||archivo.contains(".rar")) {
			this.servidorOficial.request(peticion);
			this.servidorRespaldo.request(peticion);
		} else {
			System.out.println("El tipo de archivo no es permitido");
		}
	}

}
