package adapter;

public class BancoSol implements IBancoBs {

	@Override
	public void prestamo(int bs) {
		Prestamo.getUniqueInstance().realizarPrestamo(bs);
	}

}
