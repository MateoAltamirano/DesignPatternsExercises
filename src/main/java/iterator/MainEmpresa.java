package iterator;

public class MainEmpresa {

	public static void main(String[] args) {
		Empresa mainHashMap = new Empresa();
		
		Empresa1 list1 = new Empresa1();
		list1.add(new Empleado("Mateo", 123));
		list1.add(new Empleado("Adriana", 456));
		list1.add(new Empleado("Juan", 789));

		Empresa2 list2 = new Empresa2();
		list2.add(new Empleado("Carlos", 124));
		list2.add(new Empleado("Pepe", 426));
		list2.add(new Empleado("Camila", 489));

		Empresa3 list3 = new Empresa3();
		list3.add(new Empleado("Gustavo", 153));
		list3.add(new Empleado("Diego", 656));
		list3.add(new Empleado("Alex", 719));

		Empresa4 list4 = new Empresa4();
		list4.add(new Empleado("Aleida", 331));
		list4.add(new Empleado("Natalia", 656));
		list4.add(new Empleado("Cristian", 781));

		Iterador iterador;
		iterador = list1.iterator();
		System.out.println("Empresa 1 con Lista");
		while (iterador.hasNext()) {
			Empleado empleado = (Empleado) iterador.next();
			mainHashMap.add(empleado, empleado.codigo);
			System.out.println("nombre: " + empleado.getNombre());
		}
		System.out.println();
		
		iterador = list2.iterator();
		System.out.println("Empresa 2 con Array");
		while (iterador.hasNext()) {
			Empleado empleado = (Empleado) iterador.next();
			mainHashMap.add(empleado, empleado.codigo);
			System.out.println("nombre: " + empleado.getNombre());
		}
		System.out.println();
		
		iterador = list3.iterator();
		System.out.println("Empresa 3 con Vector");
		while (iterador.hasNext()) {
			Empleado empleado = (Empleado) iterador.next();
			mainHashMap.add(empleado, empleado.codigo);
			System.out.println("nombre: " + empleado.getNombre());
		}
		System.out.println();
		
		iterador = list4.iterator();
		System.out.println("Empresa 4 con Stack");
		while (iterador.hasNext()) {
			Empleado empleado = (Empleado) iterador.next();
			mainHashMap.add(empleado, empleado.codigo);
			System.out.println("nombre: " + empleado.getNombre());
		}
		System.out.println();
		System.out.println("Lista completa en el HashMap");
		iterador = mainHashMap.iterator();
		while (iterador.hasNext()) {
			Empleado empleado = (Empleado) iterador.next();
			System.out.println("Empleado: "+ empleado.getNombre()+" con codigo: "+empleado.getCodigo());
		}
	}

}
