package facade;

public class Cooperativa1 implements Cooperativas {
	private int prestamo;

	public Cooperativa1(int prestamo) {
		this.prestamo = prestamo;
	}

	@Override
	public void prestamo() {
		System.out.println("Cooperativa 1: " + this.prestamo);
	}
}
