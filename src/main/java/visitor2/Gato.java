package visitor2;

public class Gato implements IAnimal {
	private Enfermedades enfermedad;

	public Enfermedades getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(Enfermedades enfermedad) {
		this.enfermedad = enfermedad;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
