package chainOfResponsability2;

public class Main {

	public static void main(String[] args) {
		Organizador organizador = new Organizador();
		organizador.criteriaHandler(Ordenes.Entrevistas);
		organizador.criteriaHandler(Ordenes.Disciplina);
		organizador.criteriaHandler(Ordenes.Desbloqueos);
		organizador.criteriaHandler(Ordenes.Manifestaciones);
		organizador.criteriaHandler(Ordenes.Limpiezas);
	}

}
