package duck;


/**
 * ÏğÆ¤Ñ¼
 * 
 * @author YangYi
 *
 */
public class RubberDuck extends AbstarctDuck {

	@Override
	public void quack() {
		System.out.println("ÏğÆ¤Ñ¼·¢³öÁËÖ¨Ö¨µÄÉùÒô:" + this);
		super.quack();
	}
}
