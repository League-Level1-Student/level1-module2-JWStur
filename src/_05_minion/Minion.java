package _05_minion;

public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	public Minion(String n, int e, String c, String m) {
		name = n;
		eyes = e;
		color = c;
		master = m;
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public Object getEyes() {
		// TODO Auto-generated method stub
		return eyes;
	}

	public Object getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	public void setMaster(String string) {
		// TODO Auto-generated method stub
		master = string;
	}

	public Object getMaster() {
		// TODO Auto-generated method stub
		return master;
	}

}
