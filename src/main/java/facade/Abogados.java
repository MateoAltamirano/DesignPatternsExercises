package facade;

public class Abogados {
	private String nombrePrestamo;

	public Abogados(String nombrePrestamo) {
		this.nombrePrestamo = nombrePrestamo;
	}

	public void findAbogado() {
		System.out.println("Buscando abogado para "+nombrePrestamo);
	}
}
