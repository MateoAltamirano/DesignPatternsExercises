package adapter2;

public class Main {

	public static void main(String[] args) {
		Computadora computadora = new Computadora(1000,4);
		Tablet tablet = new Tablet(500,2);
		Celular celular = new Celular(800,3);
		Televisor televisor = new Televisor(300,5);
		Refrigerador refrigerador = new Refrigerador(600,10);
		Lavadora lavadora = new Lavadora(400,8);
		
		TelevisorAdapter televisorAdapter = new TelevisorAdapter(televisor);
		RefrigeradorAdapter refrigeradorAdapter = new RefrigeradorAdapter(refrigerador);
		LavadoraAdapter lavadoraAdapter = new LavadoraAdapter(lavadora);
		
		System.out.println(computadora.precio());
		System.out.println(tablet.precio());
		System.out.println(celular.precio());
		System.out.println(televisorAdapter.precio());
		System.out.println(refrigeradorAdapter.precio());
		System.out.println(lavadoraAdapter.precio());
	}

}
