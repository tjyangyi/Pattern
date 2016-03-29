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
	protected String dough;// ����
	protected String sauce;// ��֭
	protected ArrayList<String> toppings = new ArrayList<String>();// ����

	public void prepare() {
		System.out.println("����׼��" + name);
		System.out.println("������...");
		System.out.println("�ӽ���...");
		System.out.println("������...");
	}

	public void bake() {
		System.out.println("�濾25����");
	}

	public void cut() {
		System.out.println("б�г�8��");
	}

	public void box() {
		System.out.println("װ��������");
	}

}
