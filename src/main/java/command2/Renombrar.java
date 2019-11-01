package command2;

public class Renombrar implements ICommand {
	private Receiver receiver;

	public Renombrar(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.renombar();
	}

}
