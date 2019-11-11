package composite2;

import java.util.ArrayList;

public class Composite extends Component {
	private ArrayList<Component> list = new ArrayList<>();

	public Composite(String nombre, int precio) {
		super(nombre,precio);
	}

	@Override
	public void print() {
		int precio = 0;
		for (Component comp : list) {
			comp.print();
			precio += comp.getPrecio();
		}
		this.setPrecio(precio);
		System.out.println(this.getNombre() + ": precio: " + this.getPrecio());
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
