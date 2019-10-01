package mediator;

public class Desarrollador1 extends Desarrollador{

	public Desarrollador1(SalaChat sala) {
		super(sala);
	}

	@Override
	public void send(String msg) {
		sala.send(msg, Desarrolladores.Desarrollador1);
	}

	@Override
	public void messageReceived(String msg) {
		System.out.println("Desarrollador 1 recibe mensaje: " + msg);

	}

	@Override
	public void sendSpecific(String msg, Desarrolladores destino) {
		sala.sendSpecific(msg,Desarrolladores.Desarrollador1,destino);
		
	}

}
