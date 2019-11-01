package command;

public class Suspender implements IAcciones {
	private Computadora receiver;

	public Suspender(Computadora receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.suspender();
	}

}
