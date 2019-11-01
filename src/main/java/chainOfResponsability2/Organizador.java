package chainOfResponsability2;

public class Organizador implements IHandler {
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
		Cabo handler1 = new Cabo();
		this.setNext(handler1);

		Coronel handler2 = new Coronel();
		handler1.setNext(handler2);

		Teniente handler3 = new Teniente();
		handler2.setNext(handler3);

		General handler4 = new General();
		handler3.setNext(handler4);

		next.criteriaHandler(orden);
	}

}
