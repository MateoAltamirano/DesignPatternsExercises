package adapter2;

public class Computadora implements IArtefactos1{
	private int precio;
	private int tiempoDeVida;

	public Computadora(int precio, int tiempoDeVida) {
		this.precio = precio;
		this.tiempoDeVida = tiempoDeVida;
	}

	@Override
	public int precio() {
		return precio;
	}

	@Override
	public int tiempoDeVida() {
		return tiempoDeVida;
	}


}
