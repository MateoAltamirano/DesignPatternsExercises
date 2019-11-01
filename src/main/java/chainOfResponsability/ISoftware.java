package chainOfResponsability;

public interface ISoftware {

	public void setNext(ISoftware handler);

	public ISoftware next();

	public void procesoCarnetizacion(Persona persona);
}
