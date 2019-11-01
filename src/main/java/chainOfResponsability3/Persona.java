package chainOfResponsability3;

public class Persona {
	private int prestamo;
	private int montoDePago;

	public int getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(int prestamo) {
		this.prestamo = prestamo;
	}

	public int getMontoDePago() {
		return montoDePago;
	}

	public void setMontoDePago(int montoDePago) {
		this.montoDePago = montoDePago;
	}

	public Persona(int prestamo, int montoDePago) {
		super();
		this.prestamo = prestamo;
		this.montoDePago = montoDePago;
	}

}
