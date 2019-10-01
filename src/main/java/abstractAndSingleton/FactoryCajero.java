package abstractAndSingleton;

public class FactoryCajero {
	public static ICajero make(ConcreteCajeros type) {
		ICajero cajero;
		switch (type) {
		case Vivienda:
			cajero = new Vivienda();
			break;
		case Negocios:
			cajero = new Negocios();
			break;
		case Creditos:
			cajero = new Creditos();
			break;
		case Financiamiento:
			cajero = new Financiamiento();
			break;
		default:
			cajero = new Financiamiento();
			break;
		}
		return cajero;
	}
}
