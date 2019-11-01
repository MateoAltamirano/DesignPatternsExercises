package chainOfResponsability2;

public class Cabo implements IHandler {
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
		if(orden == Ordenes.Limpiezas) {
			System.out.println("Tarea atendida por el Cabo");
		}else {
			next.criteriaHandler(orden);
		}
	}

}
