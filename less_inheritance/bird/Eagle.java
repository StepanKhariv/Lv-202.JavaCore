package less_Inheritance_01;

public class Eagle extends FlyingBird {
	private String name;


	public Eagle(boolean feahers, boolean layEggs, String name) {
		super(feahers, layEggs);
		this.name=name;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Eagle [name=" + name + "]";
	}

}
