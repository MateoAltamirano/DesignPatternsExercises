package strategy2;

import java.util.Arrays;

public class Binaria implements IStrategy {
	private int[] precios;
	private Modelos[] modelos;
	private Celular celular;

	public Binaria(Celular[] celulares, Celular celular) {
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
		System.out.println("BINARIA");
		int precio = Arrays.binarySearch(precios, celular.getPrecio());
		int modelo = Arrays.binarySearch(modelos, celular.getModelo());
		if (precio>0&&precios[precio] == celular.getPrecio()&&modelo>0&&modelos[modelo]==celular.getModelo()) {
			System.out.println("Tenemos este celular");		
		}else {
			System.out.println("No tenemos este celular");
		}
	}

}
