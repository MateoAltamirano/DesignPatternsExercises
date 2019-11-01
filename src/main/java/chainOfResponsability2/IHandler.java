package chainOfResponsability2;

public interface IHandler {

	public void setNext(IHandler handler);

	public IHandler next();

	public void criteriaHandler(Ordenes orden);
}
