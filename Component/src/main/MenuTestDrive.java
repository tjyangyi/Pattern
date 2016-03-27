package main;

import client.Waitress;
import leaf.MenuItem;
import component.MenuComponent;
import composite.Menu;

public class MenuTestDrive {

	public static void main(String[] args) {
		MenuComponent dinMenu = new Menu("DIN MENU", "Lunch");
		MenuComponent dessertMenu = new Menu("DESSERT MENU",
				"Dessert of course");

		MenuComponent allMenus = new Menu("ALL MENUS", "ALL menus combined");

		allMenus.add(dinMenu);

		dinMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("Apple Pie", "Description 2", true, 1.59));
		/*dessertMenu
				.add(new MenuItem("Banana Pie", "Description 6", true, 1.59));*/

		// MenuComponent dessertMenuSon = new Menu("DESSERT MENU SON",
		// "DESSERT MENU SON");
		// dessertMenuSon.add(new MenuItem("Orange Pie", "Description 1", true,
		// 1.59));
		// dessertMenuSon
		// .add(new MenuItem("kuku Pie", "Description 9", true, 1.59));
		// dessertMenu.add(dessertMenuSon);

		Waitress waitress = new Waitress(allMenus);

		waitress.printVegetarianMenu();
	}

}
