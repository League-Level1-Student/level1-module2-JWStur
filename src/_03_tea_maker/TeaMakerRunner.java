package _03_tea_maker;

public class TeaMakerRunner {
	public static void main(String[] args) {
		Cup cup = new Cup();
		TeaBag bag = new TeaBag(TeaBag.PASSION_FRUIT);
		Kettle kettle = new Kettle();
		
		kettle.boil();
		cup.makeTea(bag, kettle.getWater());
		
	}
}
