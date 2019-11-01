package chainOfResponsability;

public class ResponsableCarnetizacion implements ISoftware {
	private ISoftware next;

	@Override
	public void setNext(ISoftware handler) {
		next = handler;
	}

	@Override
	public ISoftware next() {
		return next;
	}

	@Override
	public void procesoCarnetizacion(Persona persona) {
		if (persona.getCertificadoDeNacimiento() && persona.getPagoAlBanco() && persona.getFicha()) {
			System.out.println("Cuenta con todos los requisitos, atentido por el responsable de carnetizacion");
		} else {
			next.procesoCarnetizacion(persona);
		}
	}

}
