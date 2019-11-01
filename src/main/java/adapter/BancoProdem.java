package adapter;

public class BancoProdem implements IBancoBs{

	@Override
	public void prestamo(int bs) {
		Prestamo.getUniqueInstance().realizarPrestamo(bs);
	}

}
