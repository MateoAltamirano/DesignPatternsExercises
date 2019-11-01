package facade;

public class FondoFinanciero {
	private int fondos;

	public FondoFinanciero(int fondos) {
		this.fondos = fondos;
	}

	public void prestamo() {
		System.out.println("Fondo financiero--> fondos: " + fondos);
	}
}
