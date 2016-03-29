package concreteComponent;
import component.Beverage;


public class Espresso extends Beverage{
	public Espresso(){
		super.description = "Espresso";//ù‚øß∑»
	}
	
	@Override
	public double getCost() {
		return 1.99;
	} 

}
