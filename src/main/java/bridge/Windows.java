package bridge;

public class Windows implements IPlataforma {
	private IArquitectura arquitectura;

	public Windows(IArquitectura arquitectura) {
		this.arquitectura = arquitectura;
	}

	@Override
	public void arquitectura() {
		System.out.print("Windows");
		this.arquitectura.operation();
	}

}
