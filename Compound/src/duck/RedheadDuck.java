package duck;


/**
 * ��ͷѼ
 * 
 * @author YangYi
 *
 */
public class RedheadDuck extends AbstarctDuck {

	@Override
	public void quack() {
		System.out.println("��ͷѼ�ڽ�:" + this);
		super.quack();
	}

}
