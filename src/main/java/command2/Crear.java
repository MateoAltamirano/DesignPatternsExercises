package command2;

public class Crear implements ICommand {
	private Receiver receiver;

	public Crear(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.crear();
	}

}
