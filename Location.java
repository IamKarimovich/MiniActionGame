import java.util.Scanner;

public abstract class Location {
	Scanner scan =  new Scanner(System.in);
	public Player player;
	protected String name;
	Inventory inv = new Inventory();
	EnemyPlace e;
	BattleLoc bat;

	public Location(Player player, String name) {
		super();
		this.player = player;
		this.name = name;
	}

	public void locationChoose()
	{
			
			switch (locMenu()) {
			case 1:
				new SafeHouse(player, "Safe House");
				break;
			case 2:
				e = new Zombie();
				new Cave(player,"Cave",e);			
				break;
			case 3:
				e = new Vampire();
				new Forest(player, "Forest",e);
				
				break;
			case 4:
				e = new Bear();
				new River(player, "River",e);
				break;
			case 5:
				new ToolStore(player, "Tool Store");
				break;
			case 6:
				new HelpCenter(player);
				break;
			case 7:
				exitGame();
				break;
			default:
				new HelpCenter(player);
				break;
			}
	}
	
	public int locMenu(){
		System.out.println("\t\t\t\t-----------------------------------------");
		System.out.println("\t\t\t\t"+"1 - Safe House");
		System.out.println("\t\t\t\t"+"2 - Cave" );
		System.out.println("\t\t\t\t"+"3 - Forest");
		System.out.println("\t\t\t\t"+"4 - River");
		System.out.println("\t\t\t\t"+"5 - Tool Store");
		System.out.println("\t\t\t\t6 - Help and info center");
		System.out.println("\t\t\t\t7 - Quit Game!");
		System.out.println("\t\t\t\t-----------------------------------------");
		System.out.print("\t\t\t\t"+"Your choice: ");
		int locCho = scan.nextInt();
		System.out.println("\t\t\t\t-----------------------------------------");
		return locCho;
	}
	
	public void exitGame()
	{
		System.out.println("\t\t\t\tTHANKS FOR GAME!");
	}
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void charFutures()
	{
		System.out.println("\t\t\t\t-----------------------------------------");
		System.out.println("\t\t\t\tCharacter name: "+player.getcName());
		System.out.println("\t\t\t\tCharacter health: "+player.health);
		System.out.println("\t\t\t\tCharacter armor defence: "+player.inv.aHealth);
		System.out.println("\t\t\t\tCharacter damage: "+player.getDamage()+"+"+player.inv.wDamage);
		System.out.println("\t\t\t\t-----------------------------------------");
	}
	
}
