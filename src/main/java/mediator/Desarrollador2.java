package mediator;

public class Desarrollador2 extends Desarrollador{

	public Desarrollador2(SalaChat sala) {
		super(sala);
	}

	@Override
	public void send(String msg) {
		sala.send(msg, Desarrolladores.Desarrollador2);
	}

	@Override
	public void messageReceived(String msg) {
		System.out.println("Desarrollador 2 recibe mensaje: " + msg);

	}

	@Override
	public void sendSpecific(String msg, Desarrolladores destino) {
		sala.sendSpecific(msg,Desarrolladores.Desarrollador2,destino);
		
	}

}
