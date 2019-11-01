package bridge;

public class Linux implements IPlataforma {
	private IArquitectura arquitectura;

	public Linux(IArquitectura arquitectura) {
		this.arquitectura = arquitectura;
	}

	@Override
	public void arquitectura() {
		System.out.print("Linux");
		this.arquitectura.operation();
	}

}
