package abstractFactory;

public class FactoryCurso {
	public static Curso make(ConcreteCursos type) {
		Curso curso;
		switch (type) {
		case Matematicas:
			curso = new Matematicas();
			break;
		case Lenguaje:
			curso = new Lenguaje();
			break;
		case Historia:
			curso = new Historia();
			break;
		case Ingles:
			curso = new Ingles();
			break;
		default:
			curso = new Matematicas();
		}
		return curso;
	}
}
