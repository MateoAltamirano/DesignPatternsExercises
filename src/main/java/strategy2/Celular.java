package strategy2;

public class Celular {

	private Modelos modelo;
	private Marcas marca;
	private Gamas gama;
	private int precio;

	public Celular(Modelos modelo, Marcas marca, Gamas gama, int precio) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.gama = gama;
		this.precio = precio;
	}

	public Modelos getModelo() {
		return modelo;
	}

	public void setModelo(Modelos modelo) {
		this.modelo = modelo;
	}

	public Marcas getMarca() {
		return marca;
	}

	public void setMarca(Marcas marca) {
		this.marca = marca;
	}

	public Gamas getGama() {
		return gama;
	}

	public void setGama(Gamas gama) {
		this.gama = gama;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
