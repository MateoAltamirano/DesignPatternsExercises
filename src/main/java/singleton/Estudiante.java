package singleton;

public class Estudiante {
	void pagar(int monto) {
		Ventanilla.getUniqueInstance().pagar(monto);
		;
	}
}
