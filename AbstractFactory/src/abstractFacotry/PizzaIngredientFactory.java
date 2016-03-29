package abstractFacotry;

import abstractProduct.Cheese;
import abstractProduct.Clams;
import abstractProduct.Dough;
import abstractProduct.Pepperoni;
import abstractProduct.Sauce;
import abstractProduct.Veggie;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Pepperoni createPepperoni();
	public Clams createClam();
	public Veggie createVeggie();
}
