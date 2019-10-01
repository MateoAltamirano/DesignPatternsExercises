package interpreter;

public class MainTraducir {
	public static void main(String[] args) {
		String toInterpretate = "COMO [usuario] QUIERO [ingresar] PARA [navegar]";
		System.out.println("Evaluate: " + toInterpretate + "\nInterpretate: " + new Parse(toInterpretate).evaluate());

	}

}
