package chainOfResponsability3;

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
	public void pagarPrestamo(Persona persona) {
		
		Cajero handler1 = new Cajero();
		this.setNext(handler1);
		
		AgenteDeCredito handler2 = new AgenteDeCredito();
		handler1.setNext(handler2);
		
		Supervisor handler3 = new Supervisor();
		handler2.setNext(handler3);
		
		Encargado handler4 = new Encargado();
		handler3.setNext(handler4);
				
		next.pagarPrestamo(persona);
	}

}
