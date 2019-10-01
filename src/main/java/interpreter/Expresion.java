package interpreter;

public class Expresion extends ExpresionAbstracta {
	String token;

	public Expresion(String token) {
		this.token = token;
	}

	@Override
	public void interpreter(Contexto context) {
		context.output = context.output + " "+token+" ";
		context.input = context.input.substring(token.length());

	}

}
