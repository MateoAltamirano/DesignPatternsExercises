package adapter2;

public class LavadoraAdapter implements IArtefactos1 {
	Lavadora lavadora;

	public LavadoraAdapter(Lavadora televisor) {
		this.lavadora = televisor;
	}

	@Override
	public int precio() {
		return lavadora.costo();
	}

	@Override
	public int tiempoDeVida() {
		return lavadora.tiempoDeGarantia();
	}

}
