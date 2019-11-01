package interpreter;

public class MainTraducir {
	public static void main(String[] args) {
		String toInterpretate = "COMO [usuario] QUIERO [ingresar a la app] PARA [navegar]";
		System.out.println("Evaluate: " + toInterpretate + "\nInterpretate: " + new Parse(toInterpretate).evaluate());

	}

}
