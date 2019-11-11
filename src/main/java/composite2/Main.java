package composite2;

public class Main {

	public static void main(String[] args) {
		Composite laboratorio1 = new Composite("Laboratorio 1",0);
		laboratorio1.add(new Computadora("Computadora 1", 100));
		laboratorio1.add(new Computadora("Computadora 2", 100));
		
		Composite laboratorio2 = new Composite("Laboratorio 2",0);
		laboratorio2.add(new Computadora("Computadora 3", 100));
		laboratorio2.add(new Computadora("Computadora 4", 100));
		
		Composite contenedor = new Composite("Contenedor de computadoras", 0);
		contenedor.add(laboratorio1);
		contenedor.add(laboratorio2);
		System.out.println();
		contenedor.print();
	}
	
}
