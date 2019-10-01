package iterator;

import java.util.Vector;

public class Empresa3 implements ILista {

	Vector<Empleado> empleados;

	public Empresa3() {
		this.empleados = new Vector<Empleado>();
	}

	public void add(Empleado value) {
		empleados.add(value);
	}

	@Override
	public IteratorVector iterator() {
		return new IteratorVector(this.empleados);
	}

}
