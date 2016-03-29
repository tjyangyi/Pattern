package abstractClass;

public abstract class Drink {
	public final void prepare() {
		boilWater();
		brew();
		pourInCup();
		if (isCustomerWantsCondiments()) {
			addCondiments();
		}
	}

	protected abstract void addCondiments();

	protected abstract void brew();

	final protected void pourInCup() {
		System.out.println("pouring into cup");
	}

	final protected void boilWater() {
		System.out.println("boiling water");
	}

	protected boolean isCustomerWantsCondiments() {
		return true;
	}
}
