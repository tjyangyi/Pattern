package duck;

/**
 * Ѽ����
 * 
 * @author YangYi
 *
 */
public class DuckCall extends AbstarctDuck {

	@Override
	public void quack() {
		System.out.println("Ѽ�������������ɵ�����:" + this);
		super.quack();
	}

}
