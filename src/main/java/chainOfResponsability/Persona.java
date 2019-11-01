package chainOfResponsability;

public class Persona {
	private boolean certificadoDeNacimiento;
	private boolean pagoAlBanco;
	private boolean ficha;

	public boolean getCertificadoDeNacimiento() {
		return certificadoDeNacimiento;
	}

	public void setCertificadoDeNacimiento(boolean certificadoDeNacimiento) {
		this.certificadoDeNacimiento = certificadoDeNacimiento;
	}

	public boolean getPagoAlBanco() {
		return pagoAlBanco;
	}

	public void setPagoAlBanco(boolean pagoAlBanco) {
		this.pagoAlBanco = pagoAlBanco;
	}

	public boolean getFicha() {
		return ficha;
	}

	public void setFicha(boolean ficha) {
		this.ficha = ficha;
	}

	public Persona(boolean certificadoDeNacimiento, boolean pagoAlBanco, boolean ficha) {
		this.certificadoDeNacimiento = certificadoDeNacimiento;
		this.pagoAlBanco = pagoAlBanco;
		this.ficha = ficha;
	}

}
