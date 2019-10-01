package interpreter;

import java.util.ArrayList;

public class Parse {
	private ArrayList<ExpresionAbstracta> parseTree = new ArrayList<>();
	private Contexto context;

	public Parse(String s) {
		context = new Contexto(s.replace(" ", ""));
		for (String token : s.split(" ")) {
			switch (token) {
			case "COMO":
				parseTree.add(new TerminalExpressionComo());
				break;
			case "QUIERO":
				parseTree.add(new TerminalExpressionQuiero());
				break;
			case "PARA":
				parseTree.add(new TerminalExpressionPara());
				break;
			default:
				parseTree.add(new Expresion(token));
				break;
			}
		}
	}

	public String evaluate() {
		for (ExpresionAbstracta e : parseTree) {
			e.interpreter(context);
		}
		return context.output;
	}
}
