package interpreter;

public class TerminalExpressionComo extends ExpresionAbstracta {

	@Override
	public void interpreter(Contexto context) {
		if (context.input.startsWith("COMO")) {
			context.output = context.output + "GIVEN";
			context.input = context.input.substring(4);
		}

	}

}
