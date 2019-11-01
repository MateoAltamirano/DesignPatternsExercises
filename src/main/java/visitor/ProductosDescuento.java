package visitor;

public class ProductosDescuento implements IProductos {
	private double precio;
	private double descuento;
	
	
	
	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
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
