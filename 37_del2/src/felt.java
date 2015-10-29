
public class felt {

	private String name;
	private int point;

	public felt(String name, int point) {
		
		this.name = name;
		this.point = point;
		
	}

	@Override
	public String toString() {
		return "felt [name=" + name + ", point=" + point + "]";
	}

	public String getName() {
		return name;
	}

	public int getPoint() {
		return point;
	}

}
