package command;

public class Apagar implements IAcciones {
	private Computadora receiver;

	public Apagar(Computadora receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.apagar();
	}

}
