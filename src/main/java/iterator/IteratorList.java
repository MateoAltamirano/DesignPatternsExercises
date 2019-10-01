package iterator;

import java.util.List;

public class IteratorList implements Iterador {
	private List<Empleado> empleados;
	private int position;

	public IteratorList(List<Empleado> empleados) {
		this.empleados = empleados;
		this.position=0;
	}

	@Override
	public Object next() {
		return empleados.get(position++);
	}

	@Override
	public boolean hasNext() {
		return empleados.size() != 0 && position < empleados.size();
	}

}
