package iterator;

import java.util.Stack;

public class Empresa4 implements ILista {

	private Stack<Empleado> empleados;

	public Empresa4() {
		this.empleados = new Stack<Empleado>();
	}

	public void add(Empleado value) {
		empleados.push(value);
	}

	@Override
	public IteratorStack iterator() {
		return new IteratorStack(this.empleados);
	}

}
