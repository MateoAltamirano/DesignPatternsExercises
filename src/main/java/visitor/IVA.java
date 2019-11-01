package visitor;

public class IVA implements IVisitor {

	@Override
	public double visit(ProductosNormales normales) {
		double precioConIva = normales.getPrecio()+normales.getPrecio()*0.05;
		normales.setPrecio(precioConIva);
		return normales.getPrecio();
	}

	@Override
	public double visit(ProductosDescuento descuento) {
		descuento.setPrecio(descuento.getPrecio()-descuento.getPrecio()*descuento.getDescuento());
		double precioConIva = descuento.getPrecio()+descuento.getPrecio()*0.05;
		descuento.setPrecio(precioConIva);
		return descuento.getPrecio();
	}
	
	@Override
	public double visit(ProductosSobreprecio sobreprecio) {
		sobreprecio.setPrecio(sobreprecio.getPrecio()+sobreprecio.getSobreprecio());
		double precioConIva = sobreprecio.getPrecio()+sobreprecio.getPrecio()*0.05;
		sobreprecio.setPrecio(precioConIva);
		return sobreprecio.getPrecio();
	}
}
