package mediator;

public class Desarrollador3 extends Desarrollador{

	public Desarrollador3(SalaChat sala) {
		super(sala);
	}

	@Override
	public void send(String msg) {
		sala.send(msg, Desarrolladores.Desarrollador3);
	}

	@Override
	public void messageReceived(String msg) {
		System.out.println("Desarrollador 3 recibe mensaje: " + msg);

	}

	@Override
	public void sendSpecific(String msg, Desarrolladores destino) {
		sala.sendSpecific(msg,Desarrolladores.Desarrollador3,destino);
		
	}

}
