package proxy;

public class Client {

	public static void main(String[] args) {
		IBanco banco = new Cajero(new Retiro(100,Monedas.Boliviano));
		banco.retiro();
		banco = new Cajero(new Deposito(100,Monedas.Boliviano));
		banco.deposito();
		
		banco = new Cajero(new Retiro(100,Monedas.Dolar));
		banco.retiro();
		banco = new Cajero(new Deposito(100,Monedas.Dolar));
		banco.deposito();
		
		banco = new Cajero(new Retiro(100,Monedas.Euro));
		banco.retiro();
		banco = new Cajero(new Deposito(100,Monedas.Euro));
		banco.deposito();
		

//		

	}

}
