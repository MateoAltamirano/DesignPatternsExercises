package chainOfResponsability2;

public class Coronel implements IHandler {
	private IHandler next;

	@Override
	public void setNext(IHandler handler) {
		next = handler;
	}

	@Override
	public IHandler next() {
		return next;
	}

	@Override
	public void criteriaHandler(Ordenes orden) {
		if (orden == Ordenes.Desbloqueos || orden == Ordenes.Manifestaciones) {
			System.out.println("Tarea atendida por el Coronel");
		} else {
			next.criteriaHandler(orden);
		}
	}

}
