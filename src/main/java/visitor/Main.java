package visitor;

public class Main {

	public static void main(String[] args) {
		ProductosNormales normal = new ProductosNormales();
		ProductosDescuento descuento = new ProductosDescuento();
		ProductosSobreprecio sobreprecio = new ProductosSobreprecio();
		
		normal.setPrecio(100);
		
		descuento.setPrecio(100);
		descuento.setDescuento(0.1);

		sobreprecio.setPrecio(100);
		sobreprecio.setSobreprecio(100);

		IVA iva = new IVA();

		System.out.println("Producto normal: " + normal.accept(iva));
		System.out.println("Producto con descuento: " + descuento.accept(iva));
		System.out.println("Producto con sobreprecio: " + sobreprecio.accept(iva));
	}

}
