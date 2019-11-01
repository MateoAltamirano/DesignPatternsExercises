package command;

public class CerrarSesion implements IAcciones {
	private Computadora receiver;

	public CerrarSesion(Computadora receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.cerrarSesion();
	}

}
