package abstractAndSingleton;

public class MainPrestamos {

	public static void main(String[] args) {
		
		ICajero vivienda = FactoryCajero.make(ConcreteCajeros.Vivienda);
		ICajero creditos = FactoryCajero.make(ConcreteCajeros.Creditos);
		ICajero financiamiento = FactoryCajero.make(ConcreteCajeros.Financiamiento);
		ICajero negocios = FactoryCajero.make(ConcreteCajeros.Negocios);
		
		
		vivienda.deposito(1000);
		creditos.deposito(1000);
		financiamiento.deposito(1000);
		negocios.deposito(1000);
	
		Thread threadVivienda = new Thread(new Runnable() {

			@Override
			public void run() {
				FactoryCajero.make(ConcreteCajeros.Vivienda).prestamo(100);

			}
		});
		Thread threadCreditos = new Thread(new Runnable() {

			@Override
			public void run() {
				FactoryCajero.make(ConcreteCajeros.Creditos).prestamo(100);
			}
		});
		Thread threadFinanciamiento = new Thread(new Runnable() {

			@Override
			public void run() {
				FactoryCajero.make(ConcreteCajeros.Financiamiento).prestamo(100);

			}
		});
		Thread threadNegocios = new Thread(new Runnable() {

			@Override
			public void run() {
				FactoryCajero.make(ConcreteCajeros.Negocios).prestamo(100);

			}
		});
		threadVivienda.start();
		threadCreditos.start();
		threadFinanciamiento.start();
		threadNegocios.start();
	}

}
