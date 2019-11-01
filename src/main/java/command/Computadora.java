package command;

import java.time.LocalDate;
import java.time.LocalTime;

public class Computadora {

	private String usuario = "Mateo";
	private LocalTime fecha;

	public Computadora(String usuario, LocalTime fecha) {
		this.usuario = usuario;
		this.fecha = fecha;
	}

	public void reiniciar() {
		System.out.println("[COMMAND---> Reiniciar] " + usuario + " " + fecha);
	}

	public void apagar() {
		System.out.println("[COMMAND---> Apagar] " + usuario + " " + fecha);
	}

	public void suspender() {
		System.out.println("[COMMAND---> Suspender] " + usuario + " " + fecha);
	}

	public void cerrarSesion() {
		System.out.println("[COMMAND---> Cerrar Sesion] " + usuario + " " + fecha);
	}
}
