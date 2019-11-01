package decorator;


public class Client {

	public static void main(String[] args) {
		IComputadora computadora = new Computadora();
		computadora = new TecladoGamer(computadora);
		computadora = new MouseGamer(computadora);
		computadora = new TarjetaVideoGamer(computadora);
		computadora = new MonitorSamsung(computadora);
		computadora.operation();
	}

}
