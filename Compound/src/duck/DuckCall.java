package duck;

/**
 * Ñ¼ÃùÆ÷
 * 
 * @author YangYi
 *
 */
public class DuckCall extends AbstarctDuck {

	@Override
	public void quack() {
		System.out.println("Ñ¼ÃùÆ÷·¢³öÁËßÉßÉµÄÉùÒô:" + this);
		super.quack();
	}

}
