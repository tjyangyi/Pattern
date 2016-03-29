package concreteCommand;

import receiver.Fan;
import command.Command;

public abstract class FanCommand implements Command {
	Fan fan;
	int prevSpeed;

	public FanCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void undo() {
		switch (this.prevSpeed) {
		case Fan.HIGH:
			this.fan.high();
			break;
		case Fan.MEDIUM:
			this.fan.medium();
			break;
		case Fan.LOW:
			this.fan.low();
			break;
		case Fan.OFF:
			this.fan.off();
			break;
		}
	}
	
	@Override
	public void execute(){
		this.prevSpeed = fan.getSpeed();
	}
}
