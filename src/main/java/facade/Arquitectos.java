package facade;

public class Arquitectos {
	private String nombrePrestamo;

	public Arquitectos(String nombrePrestamo) {
		this.nombrePrestamo = nombrePrestamo;
	}

	public void findArquitectos() {
		System.out.println("Buscando arquitectos para "+nombrePrestamo);
	}
}
