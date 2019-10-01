package abstractFactory;

public class Client {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante();
		e1.inscribirse(ConcreteCursos.Matematicas);
		Estudiante e2 = new Estudiante();
		e2.inscribirse(ConcreteCursos.Historia);
		Estudiante e3 = new Estudiante();
		e3.inscribirse(ConcreteCursos.Lenguaje);
		Estudiante e4 = new Estudiante();
		e4.inscribirse(ConcreteCursos.Matematicas);
		Estudiante e5 = new Estudiante();
		e5.inscribirse(ConcreteCursos.Ingles);

	}

}
