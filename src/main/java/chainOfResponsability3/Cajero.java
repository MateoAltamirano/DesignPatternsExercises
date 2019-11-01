package chainOfResponsability3;

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
	public void pagarPrestamo(Persona persona) {
		if(persona.getMontoDePago()<persona.getPrestamo()*0.25) {
			System.out.println("Haciendo pago al cajero");
		}else {
			next.pagarPrestamo(persona);
		}
	}

}
