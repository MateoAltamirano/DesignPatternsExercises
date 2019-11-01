package facade;

public class Cooperativa2 implements Cooperativas {
	private int prestamo;

	public Cooperativa2(int prestamo) {
		this.prestamo = prestamo;
	}

	@Override
	public void prestamo() {
		System.out.println("Cooperativa 2: " + this.prestamo);
	}
}
