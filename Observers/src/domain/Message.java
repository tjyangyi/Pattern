package domain;
public class Message {
	public Message(float temper, float high, float presssure) {
		super();
		this.temper = temper;
		this.high = high;
		this.presssure = presssure;
	}

	@Override
	public String toString() {
		return "Message [temper=" + temper + ", high=" + high + ", presssure="
				+ presssure + "]";
	}

	private float temper;
	private float high;
	private float presssure;

	public float getTemper() {
		return temper;
	}

	public void setTemper(float temper) {
		this.temper = temper;
	}

	public float getHigh() {
		return high;
	}

	public void setHigh(float high) {
		this.high = high;
	}

	public float getPresssure() {
		return presssure;
	}

	public void setPresssure(float presssure) {
		this.presssure = presssure;
	}

}
