package interpreter;

public class TerminalExpressionQuiero extends ExpresionAbstracta {

	@Override
	public void interpreter(Contexto context) {
		if (context.input.startsWith("QUIERO")) {
			context.output = context.output + "WHEN";
			context.input = context.input.substring(6);
		}

	}

}
