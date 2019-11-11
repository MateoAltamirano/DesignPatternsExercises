package visitor2;

import java.time.LocalDateTime;

public class Veterinario implements IVisitor {

	@Override
	public void visit(Perro perro) {
		if (perro.getEnfermedad() == Enfermedades.Enfermedad1) {
			System.out.println("Recetando cura para enfermedad 1");
		} else {
			System.out.println("Recetando cura para enfermedad 2");
		}
		System.out.println("Hora de la cura: "+LocalDateTime.now());
	}

	@Override
	public void visit(Gato gato) {
		if (gato.getEnfermedad() == Enfermedades.Enfermedad1) {
			System.out.println("Recetando cura para enfermedad 1");
		} else {
			System.out.println("Recetando cura para enfermedad 2");
		}
		System.out.println("Hora de la cura: "+LocalDateTime.now());
	}

	@Override
	public void visit(Caballo caballo) {
		if (caballo.getEnfermedad() == Enfermedades.Enfermedad1) {
			System.out.println("Recetando cura para enfermedad 1");
		} else {
			System.out.println("Recetando cura para enfermedad 2");
		}
		System.out.println("Hora de la cura: "+LocalDateTime.now());
	}

}
