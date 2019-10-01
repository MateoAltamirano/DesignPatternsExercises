package mediator;

public interface SalaChat {
	public void send(String msg, Desarrolladores desarrolladores);

	public void sendSpecific(String msg, Desarrolladores origen, Desarrolladores destino);
}
