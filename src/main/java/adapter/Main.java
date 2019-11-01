package adapter;


public class Main {

	public static void main(String[] args) {
		Prestamo.getUniqueInstance().setFondos(1000);
		
		Cooperativa1 c1 = new Cooperativa1();
		CooperativaAdapter c1Adapter = new CooperativaAdapter(c1);
		c1Adapter.prestamo(100);
		System.out.println(Prestamo.getUniqueInstance().getFondos());
		
		BancoSol bancoSol = new BancoSol();
		bancoSol.prestamo(900);
		System.out.println(Prestamo.getUniqueInstance().getFondos());
	}

}
