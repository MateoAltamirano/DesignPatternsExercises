package visitor2;

public class Main {

	public static void main(String[] args) {
		Perro perro = new Perro();
		Gato gato = new Gato();
		Caballo caballo = new Caballo();
		
		perro.setEnfermedad(Enfermedades.Enfermedad1);
		gato.setEnfermedad(Enfermedades.Enfermedad2);
		caballo.setEnfermedad(Enfermedades.Enfermedad2);

		Veterinario visitor = new Veterinario();

		perro.accept(visitor);
		gato.accept(visitor);
		caballo.accept(visitor);
	}

}
