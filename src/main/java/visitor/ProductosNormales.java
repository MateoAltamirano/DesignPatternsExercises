package visitor;

public class ProductosNormales implements IProductos {
	private double precio;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public double accept(IVisitor visitor) {
		return visitor.visit(this);
	}
}
