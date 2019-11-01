package proxy;

public class Retiro {
	private int monto;
	private Monedas tipoMoneda;

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public Monedas getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(Monedas tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

	public Retiro(int monto, Monedas tipoMoneda) {
		this.monto = monto;
		this.tipoMoneda = tipoMoneda;
	}

}
