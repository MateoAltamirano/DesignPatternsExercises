package command;

public class Reiniciar implements IAcciones {
	private Computadora receiver;

	public Reiniciar(Computadora receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.reiniciar();
	}

}
