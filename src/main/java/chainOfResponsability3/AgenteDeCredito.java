package chainOfResponsability3;

public class AgenteDeCredito implements ISoftware {
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
	public void pagarPrestamo(Persona persona) {
		if (persona.getMontoDePago() >= persona.getPrestamo() * 0.25
				&& persona.getMontoDePago() < persona.getPrestamo() * 0.5) {
			System.out.println("Recibiendo pagos por el agente de credito, desea refinanciar su prestamo?");
		} else {
			next.pagarPrestamo(persona);
		}
	}

}
