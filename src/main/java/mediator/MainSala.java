package mediator;

public class MainSala {

	public static void main(String[] args) {
		ConcreteSala sala = new ConcreteSala();
		
		Desarrollador1 desarrollador1 = new Desarrollador1(sala);
		Desarrollador2 desarrollador2 = new Desarrollador2(sala);
		Desarrollador3 desarrollador3 = new Desarrollador3(sala);
		Desarrollador4 desarrollador4 = new Desarrollador4(sala);
		
		sala.setDesarrollador1(desarrollador1);
		sala.setDesarrollador2(desarrollador2);
		sala.setDesarrollador3(desarrollador3);
		sala.setDesarrollador4(desarrollador4);
		
		
		System.out.println("MENSAJE PARA TODOS LOS MIEMBROS");		
		desarrollador1.send("mensaje del Desarrollador 1");
		System.out.println();
		desarrollador2.send("mensaje del Desarrollador 2");
		System.out.println();
		desarrollador3.send("mensaje del Desarrollador 3");
		System.out.println();
		desarrollador4.send("mensaje del Desarrollador 4");
		System.out.println();
		
		System.out.println("MENSAJE PARA UN MIEMBRO ESPECIFICO");
		desarrollador1.sendSpecific("mensaje del Desarrollador 1", Desarrolladores.Desarrollador2);
		System.out.println();
		desarrollador3.sendSpecific("mensaje del Desarrollador 3", Desarrolladores.Desarrollador4);
	}

}
