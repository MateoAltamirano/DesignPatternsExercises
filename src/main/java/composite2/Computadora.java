package composite2;

public class Computadora extends Component{
	
	public Computadora(String nombre, int precio) {
		super(nombre,precio);
	}

	@Override
	public void print() {
		System.out.println("\t "+this.getNombre()+" precio: "+this.getPrecio());
	}

	@Override
	public void add(Component component) {
		System.out.println("Not applicable on Computadora");
	}

	@Override
	public void remove(Component component) {
		System.out.println("Not applicable on Computadora");
	}

	@Override
	public void getChild(int position) {
		System.out.println("\t "+this.getNombre());
	}

}
