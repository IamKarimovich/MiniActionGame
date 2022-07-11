
public class SafeHouse extends NormLoc {

	
	public SafeHouse(Player player, String name) {
		super(player, name);
		
		System.out.print("\t\t\t\tYou are in Safe House now!");
		player.setHealth(player.getrHealth());
		System.out.println("\n\t\t\t\tYou got full health!");
		charFutures();
		
		locationChoose();
		
		
		
	}

	
	
	
}
