package visitor;

public interface IVisitor {
	public double visit(ProductosNormales normales);
	public double visit(ProductosDescuento descuento);
	public double visit(ProductosSobreprecio sobreprecio);

}
