package strategy;

public class Seleccion implements IStrategy {
	private int[] promedios;

	public Seleccion(Estudiante[] estudiantes) {
		promedios = new int[estudiantes.length];
		for (int i = 0; i < estudiantes.length; i++) {
			promedios[i] = estudiantes[i].getPromedio();
		}
	}

	@Override
	public void ordenar() {
		System.out.println("SELECCION");
		int n = promedios.length;
		int posmin;
		for (int i = 0; i < n - 1; i++) {
			posmin = i;
			for (int j = i + 1; j < n; j++)
				if (promedios[j] < promedios[posmin])
					posmin = j;
			permuta(promedios, i, posmin);
		}
		
		for(int i = 0;i<promedios.length;i++) {
			System.out.println(promedios[i]);
		}
	}

	private static void permuta(int[] a, int i, int j) {
		int t;
		t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
