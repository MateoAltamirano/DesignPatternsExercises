package command;

import java.util.HashMap;

public class Invoker {
	private HashMap<String, IAcciones> hashCommand = new HashMap<String, IAcciones>();

	public void setCommand(String alias, IAcciones command) {
		hashCommand.put(alias, command);
	}

	public void runCommands() {
		for (IAcciones command : hashCommand.values()) {
			command.execute();
		}
		hashCommand.clear();
	}

	public void runOneCommand(String alias) {
		hashCommand.get(alias).execute();
	}
}
