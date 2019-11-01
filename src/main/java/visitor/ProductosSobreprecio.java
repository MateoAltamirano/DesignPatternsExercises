package visitor;

public class ProductosSobreprecio implements IProductos {
	private double precio;
	private double sobreprecio;


	public double getSobreprecio() {
		return sobreprecio;
	}

	public void setSobreprecio(double sobreprecio) {
		this.sobreprecio = sobreprecio;
	}

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
