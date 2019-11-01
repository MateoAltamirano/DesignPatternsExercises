package strategy;

public class Main {

	public static void main(String[] args) {
		Colegio context = new Colegio();
			
		Estudiante[] estudiantes1 = new Estudiante[5];
		for (int i = 0; i < estudiantes1.length; i++) {
			int numero = (int)(Math.random()*100+1);
			estudiantes1[i]= new Estudiante(numero);
		}
		
		Estudiante[] estudiantes2 = new Estudiante[9];
		for (int i = 0; i < estudiantes2.length; i++) {
			int numero = (int)(Math.random()*100+1);
			estudiantes2[i]= new Estudiante(numero);
		}
		
		Estudiante[] estudiantes3 = new Estudiante[11];
		for (int i = 0; i < estudiantes3.length; i++) {
			int numero = (int)(Math.random()*100+1);
			estudiantes3[i]= new Estudiante(numero);
		}
		
		context.setAttribute1(estudiantes1);
		context.execute();
		context.setAttribute1(estudiantes2);
		context.execute();
		context.setAttribute1(estudiantes3);
		context.execute();
	}

}
