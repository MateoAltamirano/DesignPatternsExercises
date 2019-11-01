package composite;

public class Item extends Component{
	
	public Item(String nombre, int estimacion) {
		super(nombre,estimacion);
	}

	@Override
	public void print() {
		System.out.println("\t "+this.getNombre()+": estimacion: " + this.getEstimacion());
	}

	@Override
	public void add(Component component) {
		System.out.println("Not applicable on Item");
	}

	@Override
	public void remove(Component component) {
		System.out.println("Not applicable on Item");
	}

	@Override
	public void getChild(int position) {
		System.out.println("\t Item: " + this.getNombre());
	}

}
