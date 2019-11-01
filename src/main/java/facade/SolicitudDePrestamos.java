package facade;

public class SolicitudDePrestamos {
	private Bancos banco;
	private Cooperativas cooperativa;;
	private FondoFinanciero fondoFinanciero;
	private Abogados abogado;
	private Notarios notario;
	private Arquitectos arquitecto;

	public SolicitudDePrestamos(String nombrePrestamo, int prestamo, int fondos) {
		if (prestamo <= 1000) {
			this.banco = new BancoSol(prestamo);
			this.cooperativa = new Cooperativa1(prestamo);			
		} else {
			this.banco = new BancoMS(prestamo);
			this.cooperativa = new Cooperativa2(prestamo);	
			
		}
		this.fondoFinanciero = new FondoFinanciero(fondos);
		this.abogado = new Abogados(nombrePrestamo);
		this.notario = new Notarios(nombrePrestamo);
		this.arquitecto = new Arquitectos(nombrePrestamo);
	}

	public void operation() {
		banco.prestamo();
		cooperativa.prestamo();
		fondoFinanciero.prestamo();
		abogado.findAbogado();
		notario.findNotario();
		arquitecto.findArquitectos();
	}
}
