package command2;

public class Mover implements ICommand {
	private Receiver receiver;

	public Mover(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.mover();
	}

}
