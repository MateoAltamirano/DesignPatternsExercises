package iterator;

import java.util.Stack;

public class IteratorStack implements Iterador{
	private Stack<Empleado> empleados;
	private int position;

	public IteratorStack(Stack<Empleado> empleados) {
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
