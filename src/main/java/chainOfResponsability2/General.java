package chainOfResponsability2;

public class General implements IHandler {
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
		if(orden == Ordenes.Entrevistas) {
			System.out.println("Tarea atendida por el General");
		}else {
			next.criteriaHandler(orden);
		}
	}

}
