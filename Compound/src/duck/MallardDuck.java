package duck;


/**
 * ��ͷѼ
 * 
 * @author YangYi
 *
 */
public class MallardDuck extends AbstarctDuck {

	@Override
	public void quack() {
		System.out.println("��ͷѼ�ڽ�:" + this);
		super.quack();
	}

}
