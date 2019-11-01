package chainOfResponsability2;

public class Teniente implements IHandler {
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
		if(orden == Ordenes.Disciplina) {
			System.out.println("Tarea atendida por el Teniente");
		}else {
			next.criteriaHandler(orden);
		}
	}

}
