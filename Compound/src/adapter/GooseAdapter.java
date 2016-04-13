package adapter;

import goose.Goose;
import duck.AbstarctDuck;

public class GooseAdapter extends AbstarctDuck {
	private Goose goose;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.honk();
		super.quack();
	}
}
