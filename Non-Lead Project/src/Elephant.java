
public class Elephant {

	private String name;
	private int trunk;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTrunk() {
		return trunk;
	}

	public void setTrunk(int trunk) {
		this.trunk = trunk;
	}

	public static void main(String args[])
	{
		System.out.println("hello there");
		Elephant elephant1 = new Elephant();
		elephant1.setName("clyde");
		System.out.println(elephant1.getName());
	}
}
