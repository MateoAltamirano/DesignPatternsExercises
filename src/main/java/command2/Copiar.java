package command2;

public class Copiar implements ICommand {
	private Receiver receiver;

	public Copiar(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.copiar();
	}

}
