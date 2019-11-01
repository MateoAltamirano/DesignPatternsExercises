package strategy;

public class Burbuja implements IStrategy {
	private int[] promedios;
	
	public Burbuja(Estudiante[] estudiantes) {
		promedios = new int[estudiantes.length];
		for (int i = 0; i < estudiantes.length; i++) {
			promedios[i] = estudiantes[i].getPromedio();
		}
	}

	@Override
	public void ordenar() {
		System.out.println("BURBUJA");
		int n = promedios.length;
		for (int i = 0; i <= n - 2; i++)
			for (int j = n - 1; j > i; j--)
				if (promedios[j - 1] > promedios[j])
					permuta(promedios, j - 1, j);
		
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
