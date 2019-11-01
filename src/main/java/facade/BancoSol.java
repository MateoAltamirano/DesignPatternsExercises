package facade;

public class BancoSol implements Bancos {
	private int prestamo;

	public BancoSol(int prestamo) {
		this.prestamo = prestamo;
	}

	@Override
	public void prestamo() {
		System.out.println("Banco Sol: solicitando prestamo de " + prestamo);
	}
}
