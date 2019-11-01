package chainOfResponsability;

public class AtencionAlCliente implements ISoftware {
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
		if(!persona.getCertificadoDeNacimiento()&&!persona.getPagoAlBanco()&&!persona.getFicha()) {
			System.out.println("Faltan muchos requisitos, enviado a atencion al cliente");
		}
	}

}
