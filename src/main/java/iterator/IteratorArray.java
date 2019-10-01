package iterator;

public class IteratorArray implements Iterador{
	private Empleado[] empleados;
	private int position;

	public IteratorArray(Empleado[] empleados) {
		this.empleados = empleados;
		this.position=0;
	}

	@Override
	public Object next() {
		return empleados[position++];
	}

	@Override
	public boolean hasNext() {
		return empleados.length != 0 && position < empleados.length;
	}
}
