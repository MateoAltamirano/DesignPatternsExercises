package observer;

public class Video {
	private String titulo;
	private int tiempo;
	private Categorias categoria;

	public Video(String titulo, int tiempo, Categorias categoria) {
		this.titulo = titulo;
		this.tiempo = tiempo;
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

}
