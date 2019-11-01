package command2;

public class Main {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();

		Mover mover = new Mover(receiver);
		Copiar copiar = new Copiar(receiver);
		Crear crear = new Crear(receiver);
		Renombrar renombrar = new Renombrar(receiver);

		Invoker invoker = new Invoker();

		invoker.setCommand(mover);
		invoker.setCommand(copiar);
		invoker.setCommand(crear);
		invoker.setCommand(renombrar);

		invoker.runCommands();
	}

}
