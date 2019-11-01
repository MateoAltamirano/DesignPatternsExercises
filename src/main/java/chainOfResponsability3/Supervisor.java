package chainOfResponsability3;

public class Supervisor implements ISoftware {
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
		if (persona.getMontoDePago() >= persona.getPrestamo() * 0.5
				&& persona.getMontoDePago() < persona.getPrestamo()) {
			System.out.println("Recibiendo pagos por el supervisor, le gustaria un nuevo prestamo?");
		} else {
			next.pagarPrestamo(persona);
		}
	}

}
