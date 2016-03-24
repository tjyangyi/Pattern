package main;

import client.Waitress;
import leaf.MenuItem;
import component.MenuComponent;
import composite.Menu;

public class MenuTestDrive {

	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOSE MENU ",
				"Breakfast");
		MenuComponent dinMenu = new Menu("DIN MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU",
				"Dessert of course");

		MenuComponent allMenus = new Menu("ALL MENUS", "ALL menus combined");

		//allMenus.add(pancakeHouseMenu);
	allMenus.add(dinMenu);
	//	allMenus.add(cafeMenu);
//
//		pancakeHouseMenu
//				.add(new MenuItem("Meat", "Description 3", false, 5.69));
//		pancakeHouseMenu
//				.add(new MenuItem("Beaf", "Description 4", false, 8.69));
//
//		dinMenu.add(new MenuItem("Pasta", "Description 1", true, 3.89));
//		dinMenu.add(new MenuItem("Pizza", "Description 5", false, 7.89));
		dinMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("Apple Pie", "Description 2", true, 1.59));
		dessertMenu
				.add(new MenuItem("Banana Pie", "Description 6", true, 1.59));
		
		MenuComponent dessertMenuSon = new Menu("DESSERT MENU SON",
				"DESSERT MENU SON");
		dessertMenuSon.add(new MenuItem("Orange Pie", "Description 1", true, 1.59));
		dessertMenuSon.add(new MenuItem("kuku Pie", "Description 9", true, 1.59));
		dessertMenu.add(dessertMenuSon);
//		cafeMenu.add(new MenuItem("Noddle", "Description 7", false, 0.69));
//		cafeMenu.add(new MenuItem("Rice", "Description 8", false, 0.59));

		Waitress waitress = new Waitress(allMenus);
	//	waitress.printMenu();
		waitress.printVegetarianMenu();
	}

}
