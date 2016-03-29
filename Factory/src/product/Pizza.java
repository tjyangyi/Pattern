package product;

import java.util.ArrayList;

public abstract class Pizza {

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce
				+ ", toppings=" + toppings + "]";
	}

	public static final String cheese = "cheese";
	public static final String veggie = "veggie";
	public static final String clam = "clam";
	public static final String pepperoni = "pepperoni";

	protected String name;
	protected String dough;// 面团
	protected String sauce;// 酱汁
	protected ArrayList<String> toppings = new ArrayList<String>();// 作料

	public void prepare() {
		System.out.println("正在准备" + name);
		System.out.println("揉面团...");
		System.out.println("加酱料...");
		System.out.println("加作料...");
	}

	public void bake() {
		System.out.println("烘烤25分钟");
	}

	public void cut() {
		System.out.println("斜切成8份");
	}

	public void box() {
		System.out.println("装到盒子里");
	}

}
