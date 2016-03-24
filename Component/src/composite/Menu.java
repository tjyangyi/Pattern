package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import component.MenuComponent;

public class Menu extends MenuComponent {
	@Override
	public String toString() {
		return "Menu [menuComponents=" + menuComponents + ", name=" + name
				+ ", description=" + description + "]";
	}

	private List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	private String name;
	private String description;

	public Menu(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
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
	public void print() {
		System.out.print("\n" + this.getName());
		System.out.println(", " + this.getDescription());
		System.out.println("----------------------");
//		Iterator<MenuComponent> iterator = menuComponents.iterator();
//		while (iterator.hasNext()) {
//			iterator.next().print();
//		}
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		return new CompositeIterator(this.menuComponents.iterator());
	}

}
