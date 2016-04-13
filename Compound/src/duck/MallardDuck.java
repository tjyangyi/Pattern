package duck;


/**
 * ÂÌÍ·Ñ¼
 * 
 * @author YangYi
 *
 */
public class MallardDuck extends AbstarctDuck {

	@Override
	public void quack() {
		System.out.println("ÂÌÍ·Ñ¼ÔÚ½Ğ:" + this);
		super.quack();
	}

}
