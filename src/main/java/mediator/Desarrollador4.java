package mediator;

public class Desarrollador4 extends Desarrollador{

	public Desarrollador4(SalaChat sala) {
		super(sala);
	}

	@Override
	public void send(String msg) {
		sala.send(msg, Desarrolladores.Desarrollador4);
	}

	@Override
	public void messageReceived(String msg) {
		System.out.println("Desarrollador 4 recibe mensaje: " + msg);

	}

	@Override
	public void sendSpecific(String msg, Desarrolladores destino) {
		sala.sendSpecific(msg,Desarrolladores.Desarrollador4,destino);
		
	}

}
