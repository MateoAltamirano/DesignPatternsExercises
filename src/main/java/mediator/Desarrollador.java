package mediator;

public abstract class Desarrollador {
	protected SalaChat sala;

	public Desarrollador(SalaChat sala) {
		this.sala = sala;
	}

	public abstract void send(String msg);
	public abstract void sendSpecific(String msg, Desarrolladores destino);
	public abstract void messageReceived(String msg);
}
