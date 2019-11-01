package strategy2;

public class Lineal implements IStrategy {
	private int[] precios;
	private Modelos[] modelos;
	private Celular celular;

	public Lineal(Celular[] celulares, Celular celular) {
		precios = new int[celulares.length];
		for (int i = 0; i < celulares.length; i++) {
			precios[i] = celulares[i].getPrecio();
		}
		modelos = new Modelos[celulares.length];
		for (int i = 0; i < celulares.length; i++) {
			modelos[i] = celulares[i].getModelo();
		}
		this.celular = celular;
	}

	@Override
	public void buscar() {
		System.out.println("BUSQUEDA LINEAL");
		for (int i = 0; i < precios.length; i++) {
			if(precios[i]==celular.getPrecio()&&modelos[i]==celular.getModelo()) {
				System.out.println("Tenemos este celular");
			}
		}
	}

}
