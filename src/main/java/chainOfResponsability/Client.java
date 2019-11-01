package chainOfResponsability;

public class Client {

	public static void main(String[] args) {
		Organizador organizador = new Organizador();
		organizador.procesoCarnetizacion(new Persona(true, true, true));
		organizador.procesoCarnetizacion(new Persona(false, true, true));
		organizador.procesoCarnetizacion(new Persona(true, false, true));
		organizador.procesoCarnetizacion(new Persona(false, false, false));

	}

}
