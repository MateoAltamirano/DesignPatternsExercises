package strategy;

public class Colegio {
	private IStrategy strategy;
	private Estudiante[] estudiantes;

	public void setAttribute1(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
		if (this.estudiantes.length <= 5) {
			defineOrdenamiento1(estudiantes);
		} else if (this.estudiantes.length > 5 && this.estudiantes.length < 10) {
			defineOrdenamiento2(estudiantes);
		} else {
			defineOrdenamiento3(estudiantes);
		}
	}

	public IStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	public Colegio() {

	}

	public void execute() {
		strategy.ordenar();
	}

	public void defineOrdenamiento1(Estudiante[] estudiantes) {
		this.strategy = new Burbuja(estudiantes);
	}

	public void defineOrdenamiento2(Estudiante[] estudiantes) {
		this.strategy = new Insercion(estudiantes);
	}

	public void defineOrdenamiento3(Estudiante[] estudiantes) {
		this.strategy = new Seleccion(estudiantes);
	}
}
