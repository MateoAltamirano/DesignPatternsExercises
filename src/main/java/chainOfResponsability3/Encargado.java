package chainOfResponsability3;

public class Encargado implements ISoftware {
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
		if(persona.getMontoDePago()==persona.getPrestamo()) {
			System.out.println("Encargado devolviendo todos sus documentos");
		}else {
			next.pagarPrestamo(persona);
		}
	}

}
