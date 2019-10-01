package iterator;

import java.util.Vector;

public class IteratorVector implements Iterador{
	private Vector<Empleado> empleados;
	private int position;

	public IteratorVector(Vector<Empleado> empleados) {
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
