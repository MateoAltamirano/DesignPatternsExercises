package abstractFactory;

public class Estudiante {
void inscribirse(ConcreteCursos curso) {
	FactoryCurso.make(curso).inscribirse();
}
}
