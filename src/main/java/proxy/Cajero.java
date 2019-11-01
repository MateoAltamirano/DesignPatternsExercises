package proxy;

public class Cajero implements IBanco {
	private Retiro retiro;
	private Deposito deposito;
	private Banco realSubject = null;

	public Cajero(Retiro retiro) {
		this.retiro = retiro;

	}

	public Cajero(Deposito deposito) {
		this.deposito = deposito;

	}

	@Override
	public void retiro() {
		if (realSubject == null) {
			realSubject = new Banco(retiro);

		}
		if (retiro.getTipoMoneda() == Monedas.Boliviano) {
			this.realSubject.retiro();
		} else if (realSubject.retiro.getTipoMoneda() == Monedas.Dolar) {
			System.out.println("No se puede realizar el retiro pero el tipo de cambio es a 7 Bs por dolar");
		} else {
			System.out.println("No se puede realizar el retiro pero el tipo de cambio es a 10 Bs por euro");
		}
	}

	@Override
	public void deposito() {
		if (realSubject == null) {
			realSubject = new Banco(deposito);

		}
		if (deposito.getTipoMoneda() == Monedas.Boliviano) {
			this.realSubject.deposito();
		} else if (realSubject.deposito.getTipoMoneda() == Monedas.Dolar) {
			System.out.println("No se puede realizar el deposito pero el tipo de cambio es a 7 Bs por dolar");
		} else {
			System.out.println("No se puede realizar el deposito pero el tipo de cambio es a 10 Bs por euro");
		}

	}

}
