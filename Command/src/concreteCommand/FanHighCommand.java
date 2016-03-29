package concreteCommand;

import receiver.Fan;

public class FanHighCommand extends FanCommand {

	public FanHighCommand(Fan fan) {
		super(fan);
	}

	@Override
	public void execute() {
		super.execute();
		this.fan.high();
	}
}
