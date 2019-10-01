package iterator;

import java.util.HashMap;


public class Empresa implements ILista{
	HashMap<Integer, Empleado> empleados;

	public Empresa() {

		empleados = new HashMap<Integer, Empleado>();
	}

	public void add(Empleado value, int codigo) {
		empleados.put(codigo, value);
	}

	@Override
	public IteratorHashMap iterator() {
		return new IteratorHashMap(this.empleados);
	}
}
