package chainOfResponsability3;

public interface ISoftware {

	public void setNext(ISoftware handler);

	public ISoftware next();

	public void pagarPrestamo(Persona persona);
}
