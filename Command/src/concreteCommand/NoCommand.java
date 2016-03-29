package concreteCommand;

import command.Command;

public class NoCommand implements Command {

	@Override
	public void execute() {
	}

	@Override
	public void undo() {
	}

}
