package receiver;

public class Light {
	private String name;

	public Light(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(this.toString() + " is on");
	}

	public void off() {
		System.out.println(this.toString() + " is off");
	}

	@Override
	public String toString() {
		return "Light [name=" + name + "]";
	}
}
