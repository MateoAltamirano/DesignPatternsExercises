package strategy;

public class Insercion implements IStrategy{
	private int[] promedios;

	public Insercion(Estudiante[] estudiantes) {
		promedios = new int[estudiantes.length];
		for (int i = 0; i < estudiantes.length; i++) {
			promedios[i] = estudiantes[i].getPromedio();
		}
	}
	@Override
	public void ordenar() {
		System.out.println("INSERCION");
		int n = promedios.length;
	    for (int i = 1; i <= n - 1; i++) {
	        int x = promedios[i];
	        int j = i - 1;
	        while (j >= 0 && x < promedios[j]) {
	            promedios[j + 1] = promedios[j];
	            j = j - 1;
	        }
	        promedios[j + 1] = x;
	    }
	    for (int i = 0; i < promedios.length; i++) {
			System.out.println(promedios[i]);
		}
	}

}
