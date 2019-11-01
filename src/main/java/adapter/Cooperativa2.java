package adapter;

public class Cooperativa2 implements ICooperativas {

	@Override
	public void credito(int dolares) {
		int bs = dolares / 7;
		Prestamo.getUniqueInstance().realizarPrestamo(bs);
	}

}
