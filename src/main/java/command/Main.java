package command;

import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		Computadora receiver = new Computadora("Mateo",LocalTime.now());
		Computadora receiver2 = new Computadora("Emmi",LocalTime.now());
		Computadora receiver3 = new Computadora("Carlos",LocalTime.now());
		Computadora receiver4 = new Computadora("Adriana",LocalTime.now());

		Reiniciar reiniciar = new Reiniciar(receiver);
		Apagar apagar = new Apagar(receiver2);
		Suspender suspender = new Suspender(receiver3);
		CerrarSesion cerrarSesion = new CerrarSesion(receiver4);

		Invoker invoker = new Invoker();

		invoker.setCommand("reiniciar",reiniciar);
		invoker.setCommand("apagar",apagar);
		invoker.setCommand("suspender",suspender);
		invoker.setCommand("cerrarSesion",cerrarSesion);

		invoker.runCommands();
		
		invoker.setCommand("apagar",apagar);
		invoker.runOneCommand("apagar");
	}

}
