import java.util.Scanner;

public class HelpCenter {
	Scanner scan = new Scanner(System.in);
	Location loc;
	Player player;

	public HelpCenter(Player player) {
		super();
		this.player = player;
		infoMenu();
	}

	public void infoMenu()
	{
		System.out.println("Safe House --> Here is Safe Zone! You can heal here!");
		System.out.println("Cave       --> You can collect food. Also there are Zombies! Be careful!");
		System.out.println("Forest     --> You can collect wood. Also there are Vampires! Let's fight!");
		System.out.println("River      --> You can collect water. Also there are Bears! Danger!");
		System.out.println("Tool Store --> You can buy items; Armor,Weapon etc. Come here if you have money...");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("During fight you can heat enemy and run from there. If you run,you'll lost money -_<");
		System.out.println("For to win Game,you should collect all of items...");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print("                                                                    Back to menu <B> \n\n\n\n");
		while(true)
		{
			String ch = scan.nextLine();
			ch = ch.toLowerCase();
			if(ch.equals("b"))
			{
				loc = new SafeHouse(player,"Safe House");
				break;
			}else
			{
				System.out.println("Enter correct input: ");
				
			}
		}
		
		
	}
	
	
}
