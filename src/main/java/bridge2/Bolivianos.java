package bridge2;

public class Bolivianos implements IMoneda {
	private int monto;

	public int getMonto() {
		return monto;
	}



	public void setMonto(int monto) {
		this.monto = monto;
	}


	@Override
	public void monto() {
		System.out.print(monto);
	}

}
