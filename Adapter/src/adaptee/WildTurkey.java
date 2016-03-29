package adaptee;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("gobble gobble ");

	}

	@Override
	public void fly() {
		System.out.println("fly a short distance");
	}

}
