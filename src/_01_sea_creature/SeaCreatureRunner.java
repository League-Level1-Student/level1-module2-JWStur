package _01_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature Spongebob = new SeaCreature("Spongebob");
		Spongebob.eat();
		
		SeaCreature Patrick = new SeaCreature("Patrick");
		Patrick.eat();
		Patrick.getName();
		
		SeaCreature Squidward = new SeaCreature("Squidward");
		Squidward.eat();
		Squidward.getName();
	}
}
