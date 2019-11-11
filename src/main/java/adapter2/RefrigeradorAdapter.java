package adapter2;

public class RefrigeradorAdapter implements IArtefactos1 {
	Refrigerador refrigerador;

	public RefrigeradorAdapter(Refrigerador televisor) {
		this.refrigerador = televisor;
	}

	@Override
	public int precio() {
		return refrigerador.costo();
	}

	@Override
	public int tiempoDeVida() {
		return refrigerador.tiempoDeGarantia();
	}

}
