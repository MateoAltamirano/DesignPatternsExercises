package strategy2;

public class TiendaDeCelulares {
	private IStrategy strategy;
	private Celular[] celulares;

	public void setCelulares(Celular[] celulares,Celular celular) {
		this.celulares = celulares;
		if (this.celulares.length <= 3) {
			defineBusqueda(celulares,celular);
		} else {
			defineBusqueda2(celulares,celular);
		}
	}

	public IStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	public TiendaDeCelulares() {

	}

	public void execute() {
		strategy.buscar();
	}

	public void defineBusqueda(Celular[] estudiantes,Celular celular) {
		this.strategy = new Lineal(estudiantes,celular);
	}

	public void defineBusqueda2(Celular[] estudiantes,Celular celular) {
		this.strategy = new Binaria(estudiantes,celular);
	}

}
