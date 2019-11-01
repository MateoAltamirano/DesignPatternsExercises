package proxy;

public class Banco implements IBanco {
	Retiro retiro;
	Deposito deposito;

	public Banco(Retiro retiro) {
		this.retiro = retiro;
	}

	public Banco(Deposito deposito) {
		this.deposito = deposito;
	}

	@Override
	public void retiro() {
		System.out.println("Retiro de Bs: " + this.retiro.getMonto());
	}

	@Override
	public void deposito() {
		System.out.println("Deposito de Bs: " + this.deposito.getMonto());

	}

}
