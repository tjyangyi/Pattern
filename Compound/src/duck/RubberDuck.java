package duck;


/**
 * ��ƤѼ
 * 
 * @author YangYi
 *
 */
public class RubberDuck extends AbstarctDuck {

	@Override
	public void quack() {
		System.out.println("��ƤѼ������֨֨������:" + this);
		super.quack();
	}
}
