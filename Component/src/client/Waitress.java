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
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			try {
				menuComponent.print();
			} catch (UnsupportedOperationException e) {
			}
		}
	}
}
