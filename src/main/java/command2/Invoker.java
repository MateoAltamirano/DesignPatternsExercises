package command2;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	private List<ICommand> commandList = new ArrayList<ICommand>();

	public void setCommand(ICommand command) {
		commandList.add(command);
	}

	public void runCommands() {
		for (ICommand command : commandList) {
			command.execute();
		}
		commandList.clear();
	}
}
