package singleton;

public class MainSistemaNotas {

	public static void main(String[] args) {
		Cajero cajero = new Cajero();
		cajero.setCodigo(123);
		Thread threadEstudiante1 = new Thread(new Runnable() {

			@Override
			public void run() {
				Estudiante e1 = new Estudiante();
				e1.pagar(100);
			}
		});
		Thread threadEstudiante2 = new Thread(new Runnable() {

			@Override
			public void run() {
				Estudiante e2 = new Estudiante();
				e2.pagar(111);
			}
		});
		Thread threadEstudiante3 = new Thread(new Runnable() {

			@Override
			public void run() {
				Estudiante e3 = new Estudiante();
				e3.pagar(123);
			}
		});
		Thread threadEstudiante4 = new Thread(new Runnable() {

			@Override
			public void run() {
				Estudiante e4 = new Estudiante();
				e4.pagar(321);
			}
		});
		Thread threadEstudiante5 = new Thread(new Runnable() {

			@Override
			public void run() {
				Estudiante e5 = new Estudiante();
				e5.pagar(231);
				
			}
		});
	
		threadEstudiante1.start();
		threadEstudiante2.start();
		threadEstudiante3.start();
		threadEstudiante4.start();
		threadEstudiante5.start();
		
	}

}
