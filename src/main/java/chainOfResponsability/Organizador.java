package chainOfResponsability;

public class Organizador implements ISoftware {
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
		ResponsableCarnetizacion handler1 = new ResponsableCarnetizacion();
		this.setNext(handler1);

		Notario handler2 = new Notario();
		handler1.setNext(handler2);

		Cajero handler3 = new Cajero();
		handler2.setNext(handler3);
		
		AtencionAlCliente handler4 = new AtencionAlCliente();
		handler3.setNext(handler4);
		
		next.procesoCarnetizacion(persona);
	}

}
