package iterator;

import java.util.ArrayList;
import java.util.List;

public class Empresa1 implements ILista{

	List<Empleado> empleados;

	public Empresa1() {
		this.empleados = new ArrayList<Empleado>();
	}

	public void add(Empleado value) {
		empleados.add(value);
	}

	@Override
	public IteratorList iterator() {
		return new IteratorList(this.empleados);
	}

}
