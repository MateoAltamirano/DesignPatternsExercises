package adapter2;

public class Televisor implements IArtefactos2{
	private int costo;
	private int tiempoDeGarantia;

	public Televisor(int costo, int tiempoDeGarantia) {
		this.costo = costo;
		this.tiempoDeGarantia = tiempoDeGarantia;
	}

	@Override
	public int costo() {
		return costo;
	}

	@Override
	public int tiempoDeGarantia() {
		return tiempoDeGarantia;
	}

}
