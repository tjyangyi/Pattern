package concreteCommand;

import receiver.Fan;

public class FanLowCommand extends FanCommand {

	public FanLowCommand(Fan fan) {
		super(fan);
	}

	@Override
	public void execute() {
		super.execute();
		this.fan.low();
	}

}
