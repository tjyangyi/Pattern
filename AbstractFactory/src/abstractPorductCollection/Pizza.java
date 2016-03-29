package abstractPorductCollection;

import abstractProduct.Cheese;
import abstractProduct.Clams;
import abstractProduct.Dough;
import abstractProduct.Pepperoni;
import abstractProduct.Sauce;
import abstractProduct.Veggie;

public abstract class Pizza {
	public static final String CHEESE = "cheese";
	public static final String VEGGIE = "veggie";
	public static final String CLAM = "clam";
	public static final String PEPPERONI = "pepperoni";
	
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Veggie veggie;
	protected Clams clam;

	public abstract void prepare();

	public void bake() {
		System.out.println("烘烤25分钟");
	}

	public void cut() {
		System.out.println("斜切成8份");
	}

	public void box() {
		System.out.println("装到盒子里");
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce
				+ ", cheese=" + cheese + ", pepperoni=" + pepperoni + ", clam="
				+ clam + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
