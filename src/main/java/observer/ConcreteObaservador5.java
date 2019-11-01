package observer;

public class ConcreteObaservador5 implements IObserver {
	private Categorias categoriaPreferida = Categorias.anyCategory;


	public Categorias getCategoriaPreferida() {
		return categoriaPreferida;
	}


	public void setCategoriaPreferida(Categorias categoriaPreferida) {
		this.categoriaPreferida = categoriaPreferida;
	}
	@Override
	public void update(Video video) {
		if (video.getCategoria() == categoriaPreferida) {
			System.out.println("Observador 5");
			System.out.println("[Notificacion] " + video.getTitulo());
		}
	}

}
