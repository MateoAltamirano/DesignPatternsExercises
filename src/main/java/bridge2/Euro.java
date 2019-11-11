package bridge2;

public class Euro implements IMoneda {
	private int monto;

	public int getMonto() {
		return monto;
	}



	public void setMonto(int monto) {
		System.out.println("Transformando a bolivianos...");
		monto*=10;
		this.monto = monto;
	}


	@Override
	public void monto() {
		System.out.print(monto);
	}
}
