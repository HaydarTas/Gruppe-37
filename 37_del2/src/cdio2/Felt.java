package cdio2;

public class Felt {

	private String name;
	private int point;

	public Felt(String name, int point) {

		this.name = name;
		this.point = point;

	}

	@Override
	//hvornår bliver den brugt??
	public String toString() {
		return "felt [name=" + name + ", point=" + point + "]";
	}
	// hvorfor denne metode da get feltNavn er gør det samme.?
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
