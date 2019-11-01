package bridge;

public class IOS implements IPlataforma {
	private IArquitectura arquitectura;

	public IOS(IArquitectura arquitectura) {
		this.arquitectura = arquitectura;
	}

	@Override
	public void arquitectura() {
		System.out.print("IOS");
		this.arquitectura.operation();
	}

}
