package facade;

public class Client {

	public static void main(String[] args) {
		SolicitudDePrestamos solicitudDePrestamos1 = new SolicitudDePrestamos("Prestamo 123",1000,10000);
		solicitudDePrestamos1.operation();
		System.out.println();
		SolicitudDePrestamos solicitudDePrestamos2 = new SolicitudDePrestamos("Prestamo 456",2000,20000);
		solicitudDePrestamos2.operation();
	}

}
