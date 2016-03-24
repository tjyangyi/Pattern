package client;

import java.util.Iterator;

import component.MenuComponent;

public class Waitress {
	private MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}

	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = this.allMenus.createIterator();
		System.out.println("  ");
		System.out.println("VEGETARIAN MENU");
		System.out.println("------------");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			try {
				//if (menuComponent.isVegetarian()) {
					menuComponent.print();
				//}
			} catch (UnsupportedOperationException e) {
			}
		}
	}
}
