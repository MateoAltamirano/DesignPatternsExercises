package bridge;

public class Client {

	public static void main(String[] args) {
		ArquitecturaX64 x64 = new ArquitecturaX64();
		ArquitecturaX86 x86 = new ArquitecturaX86();
		
		Windows windows64 = new Windows(x64);
		windows64.arquitectura();
		Windows windows86 = new Windows(x86);
		windows86.arquitectura();
		System.out.println();
		
		Linux linux64= new Linux(x64);
		linux64.arquitectura();
		Linux linux86= new Linux(x86);
		linux86.arquitectura();
		System.out.println();
		
		IOS ios64= new IOS(x64);
		ios64.arquitectura();
		IOS ios86= new IOS(x86);
		ios86.arquitectura();
	}

}
