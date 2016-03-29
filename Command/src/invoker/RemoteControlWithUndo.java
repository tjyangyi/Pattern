package invoker;

import java.util.ArrayList;
import java.util.List;

import command.Command;
import concreteCommand.NoCommand;

public class RemoteControlWithUndo {
	List<Command> onCommands;
	List<Command> offCommands;
	Command undoCommand;

	public RemoteControlWithUndo() {
		onCommands = new ArrayList<Command>();
		offCommands = new ArrayList<Command>();
		Command noCommand = new NoCommand();
		undoCommand = noCommand;
		for (int i = 0; i < 7; i++) {
			onCommands.add(noCommand);
			offCommands.add(noCommand);
		}
	}

	public void SetCommand(int slot, Command onCommand, Command offCommand) {
		onCommands.set(slot, onCommand);
		offCommands.set(slot, offCommand);
	}

	public void onButtonWasPressed(int slot) {
		onCommands.get(slot).execute();
		undoCommand = onCommands.get(slot);
	}

	public void offButtonWasPressed(int slot) {
		offCommands.get(slot).execute();
		undoCommand = offCommands.get(slot);
	}

	public void undoButtonWasPressed() {
		undoCommand.undo();
	}
}
