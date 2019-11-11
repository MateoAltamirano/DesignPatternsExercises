package adapter2;

public class TelevisorAdapter implements IArtefactos1 {
	Televisor televisor;

	public TelevisorAdapter(Televisor televisor) {
		this.televisor = televisor;
	}

	@Override
	public int precio() {
		return televisor.costo();
	}

	@Override
	public int tiempoDeVida() {
		return televisor.tiempoDeGarantia();
	}

}
