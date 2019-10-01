package interpreter;

public class TerminalExpressionPara extends ExpresionAbstracta {

	@Override
	public void interpreter(Contexto context) {
		if (context.input.startsWith("PARA")) {
			context.output = context.output + "THEN";
			context.input = context.input.substring(4);
		}

	}

}
