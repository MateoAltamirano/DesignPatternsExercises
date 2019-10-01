package iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class IteratorHashMap implements Iterador {
	private HashMap<Integer, Empleado> empleados;
	private Set<Integer> keys;
	private List<Integer> list;
	private int position;

	public IteratorHashMap(HashMap<Integer, Empleado> empleados) {
		this.empleados = empleados;
		this.keys = empleados.keySet();
		;
		this.list = new ArrayList<Integer>();
		this.position = 0;
		for (Integer key : keys) {
			list.add(key);
		}
	}

	@Override
	public Object next() {
		return empleados.get(list.get(position++));
	}

	@Override
	public boolean hasNext() {
		return empleados.size() != 0 && position < empleados.size();
	}

}
