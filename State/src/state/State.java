package state;

public interface State {

	/**
	 * Ͷ��Ӳ��
	 */
	public void insertQuarter();

	/**
	 * �˳�Ӳ��
	 */
	public void ejectQuarter();

	/**
	 * ת������
	 */
	public void turnCrank();

	/**
	 * �����ǹ�
	 */
	public void dispense();
}
