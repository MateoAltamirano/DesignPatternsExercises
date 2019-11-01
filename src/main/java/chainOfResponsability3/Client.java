package chainOfResponsability3;

public class Client {

	public static void main(String[] args) {
		Organizador organizador = new Organizador();
		
		Persona p1 = new Persona(100,0);
		p1.setMontoDePago(25);
		organizador.pagarPrestamo(p1);
		
		p1.setPrestamo(p1.getPrestamo()-p1.getMontoDePago());
		p1.setMontoDePago(25);
		organizador.pagarPrestamo(p1);
		
		p1.setPrestamo(p1.getPrestamo()-p1.getMontoDePago());
		p1.setMontoDePago(25);
		organizador.pagarPrestamo(p1);
		
		p1.setPrestamo(p1.getPrestamo()-p1.getMontoDePago());
		p1.setMontoDePago(25);
		organizador.pagarPrestamo(p1);
		

	}

}
