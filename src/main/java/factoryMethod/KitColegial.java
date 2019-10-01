package factoryMethod;

public class KitColegial implements IKit {
	Mochila mochila;
	Libros libros;
	Computadora computadora;


	public KitColegial(Mochila mochila, Libros libros, Computadora computadora) {
		this.mochila = mochila;
		this.libros = libros;
		this.computadora = computadora;
	}


	@Override
	public void create() {
		// TODO Auto-generated method stub

	}


	public Mochila getMochila() {
		return mochila;
	}


	public void setMochila(Mochila mochila) {
		this.mochila = mochila;
	}


	public Libros getLibros() {
		return libros;
	}


	public void setLibros(Libros libros) {
		this.libros = libros;
	}


	public Computadora getComputadora() {
		return computadora;
	}


	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}

}
