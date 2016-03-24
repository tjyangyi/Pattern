package leaf;

import java.util.Iterator;

import component.MenuComponent;

public class MenuItem extends MenuComponent {
	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", description=" + description
				+ ", vegetarian=" + vegetarian + ", price=" + price + "]";
	}

	private String name;
	private String description;
	private boolean vegetarian;
	private double price;

	public MenuItem(String name, String description, boolean vegetarian,
			double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public boolean isVegetarian() {
		return this.vegetarian;
	}

	@Override
	public void print() {
		System.out.print("   " + this.getName());
		if (this.isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.print("," + this.getPrice());
		System.out.print(" --" + this.getDescription());
		System.out.println();
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}

}
