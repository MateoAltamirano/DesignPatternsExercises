package chainOfResponsability;

public class Notario implements ISoftware {
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
		if(!persona.getCertificadoDeNacimiento()&&persona.getPagoAlBanco()&&persona.getFicha()) {
			System.out.println("Falta certificado de nacimiento, atendido por el notario para sacar su certificado");
		}else {
			next.procesoCarnetizacion(persona);
		}
	}

}
