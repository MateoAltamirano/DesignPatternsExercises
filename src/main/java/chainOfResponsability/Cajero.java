package chainOfResponsability;

public class Cajero implements ISoftware {
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
		if(persona.getCertificadoDeNacimiento()&&!persona.getPagoAlBanco()&&persona.getFicha()) {
			System.out.println("Falta pago al banco, enviando al cajero");
		}else {
			next.procesoCarnetizacion(persona);
		}
	}

}
