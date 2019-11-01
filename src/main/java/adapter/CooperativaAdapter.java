package adapter;

public class CooperativaAdapter implements IBancoBs {
	Cooperativa1 adaptee = new Cooperativa1();

	public CooperativaAdapter(Cooperativa1 adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void prestamo(int bs) {
		int dolares = bs*7;
		adaptee.credito(dolares);
	}

}
