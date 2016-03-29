package receiver;

public class Fan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	private String name;
	private int speed;

	public Fan(String name) {
		this.name = name;
		this.speed = OFF;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void high() {
		this.speed = HIGH;
		System.out.println(this.toString());
	}

	public void medium() {
		this.speed = MEDIUM;
		System.out.println(this.toString());
	}

	public void low() {
		this.speed = LOW;
		System.out.println(this.toString());
	}

	public void off() {
		this.speed = OFF;
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Fan [name=" + name + ", speed=" + speed + "]";
	}
}
