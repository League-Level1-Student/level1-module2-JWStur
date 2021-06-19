package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf Papa = new Smurf("Papa", "red", "male");
		Smurf Smurfette = new Smurf("Smurfette", "white", "female");
		Papa.eat();
		System.out.println(Papa.getHatColor());
		System.out.println(Papa.getName());
		System.out.println(Papa.isGirlOrBoy());
		Smurfette.eat();
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.isGirlOrBoy());
	}
}
