package facade;

public class Notarios {
	private String nombrePrestamo;

	public Notarios(String nombrePrestamo) {
		this.nombrePrestamo = nombrePrestamo;
	}

	public void findNotario() {
		System.out.println("Buscando notario para "+nombrePrestamo);
	}
}
