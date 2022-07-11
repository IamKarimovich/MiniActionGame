import java.util.Scanner;

public class Game{
	private String playerName;
	Scanner scan = new Scanner(System.in);
	Player player = new Player(playerName);
	Inventory inv;
	EnemyPlace e;
		
	public Game(Player player, Inventory inv,EnemyPlace enemy) {
		this.player = player;
		this.inv = new Inventory();
		this.e = enemy;
	};

	public void start()
	{
		login();
		player.selCha();
		locationChoose();	
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
	
	
	public void exitGame()
	{
		System.out.println("\t\t\t\tTHANKS FOR GAME!");
	}
	
	public int locMenu(){
		System.out.println("\t\t\t\t1 - Safe House");
		System.out.println("\t\t\t\t2 - Cave" );
		System.out.println("\t\t\t\t3 - Forest");
		System.out.println("\t\t\t\t4 - River");
		System.out.println("\t\t\t\t5 - Tool Store");
		System.out.println("\t\t\t\t6 - Help and info center");
		System.out.println("\t\t\t\t7 - Quit Game!");
		System.out.print("\t\t\t\tYour choice: ");
		int locCho = scan.nextInt();
		return locCho;
	}
	
	
	
	
	public void login() {
		System.out.print("\t\t\t\tEnter your name: ");
		playerName = scan.nextLine();
		//char PlayerNameZeroIndex = playerName.charAt(0);
		
		player.setPname(playerName);
		
	}
	
	
	
	
	
	
	
	
	
}
