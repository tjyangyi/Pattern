package client;

import invoker.RemoteControlWithUndo;
import receiver.Fan;
import receiver.Light;
import concreteCommand.FanHighCommand;
import concreteCommand.FanLowCommand;
import concreteCommand.LightOffCommand;
import concreteCommand.LightOnCommand;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

		Light livingRoomLight = new Light("Living Room");
		LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

		remoteControl.SetCommand(0, lightOnCommand, lightOffCommand);
		remoteControl.onButtonWasPressed(0);
		remoteControl.undoButtonWasPressed();

		remoteControl.offButtonWasPressed(0);
		remoteControl.undoButtonWasPressed();

		Fan fan = new Fan("Living room");
		FanHighCommand fanHighCommand = new FanHighCommand(fan);
		FanLowCommand fanLowCommand = new FanLowCommand(fan);
		remoteControl.SetCommand(1, fanHighCommand, null);
		remoteControl.SetCommand(2, fanLowCommand, null);

		remoteControl.onButtonWasPressed(1);
		remoteControl.onButtonWasPressed(2);
		
	}

}
