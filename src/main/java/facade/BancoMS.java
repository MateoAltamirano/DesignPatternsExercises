package facade;

public class BancoMS implements Bancos {
	private int prestamo;

	public BancoMS(int prestamo) {
		this.prestamo = prestamo;
	}

	@Override
	public void prestamo() {
		System.out.println("Banco: solicitando prestamo de " + prestamo);
	}
}
