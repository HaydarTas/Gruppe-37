package cdio2;

public class Felt {

	private String name;
	private int point;

	public Felt(String name, int point) {

		this.name = name;
		this.point = point;

	}

	@Override
	
	public String toString() {
		return "felt [name=" + name + ", point=" + point + "]";
	}
	// ekstra getter.
	public String getName() {
		return name;
	}

	public int getPoint() {
		return point;
	}

	public String getfeltNavn() {

		return name;
	}

}
