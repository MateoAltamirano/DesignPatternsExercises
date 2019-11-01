package composite;

import java.util.ArrayList;

public class Composite extends Component {
	private ArrayList<Component> list = new ArrayList<>();

	public Composite(String nombre, int estimacion) {
		super(nombre, estimacion);
	}

	@Override
	public void print() {
		int estimacion = 0;
		for (Component comp : list) {
			comp.print();
			estimacion += comp.getEstimacion();
		}
		this.setEstimacion(estimacion);
		System.out.println(this.getNombre() + ": estimacion: " + this.getEstimacion());
		System.out.println();
	}

	@Override
	public void add(Component component) {
		list.add(component);

	}

	@Override
	public void remove(Component component) {
		list.remove(component);

	}

	@Override
	public void getChild(int position) {
		System.out.println(list.get(position).getNombre());

	}
}
