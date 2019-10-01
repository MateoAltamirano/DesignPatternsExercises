package iterator;

public class Empresa2 implements ILista {
	private int position;
	private Empleado[] empleados;

	public Empresa2() {
		this.position = 0;
		this.empleados = new Empleado[3];
	}

	public void add(Empleado value) {
		empleados[position] = value;
		position++;
	}

	@Override
	public IteratorArray iterator() {
		return new IteratorArray(this.empleados);
	}

}
