package component;
public abstract class Beverage {// ï‹ÁÏ
	protected String description = "Unknown";

	public String getDescription() {
		return description;
	}

	public abstract double getCost();
}
