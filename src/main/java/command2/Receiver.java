package command2;

public class Receiver {
	private String archivo = "Archivo";

	public void mover() {
		System.out.println("[COMMAND---> Mover] Moviendo..." + archivo);
	}

	public void copiar() {
		System.out.println("[COMMAND---> Copiar] Copiando..." + archivo);
	}

	public void crear() {
		System.out.println("[COMMAND---> Crear] Creando..." + archivo);
	}

	public void renombar() {
		System.out.println("[COMMAND---> Renombrar] Renombrando..." + archivo);
	}
}
