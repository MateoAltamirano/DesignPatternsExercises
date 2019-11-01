package cine;

public class FactoryPelicula {
	public static IPeliculas make(ConcretePeliculas type) {
		IPeliculas pelicula;
		switch (type) {
		case Drama:
			pelicula = new ConcreteDrama();
			break;
		case Accion:
			pelicula = new ConcreteAccion();
			break;
		case Comedia:
			pelicula = new ConcreteComedia();
			break;
		case Terror:
			pelicula = new ConcreteTerror();
			break;
		default:
			pelicula = new ConcreteDrama();
			break;
		}
		return pelicula;
	}
}
