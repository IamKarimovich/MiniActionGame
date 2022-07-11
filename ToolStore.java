
public class ToolStore extends NormLoc{
	
	int wCost,aCost;
	
	public ToolStore(Player player, String name) {
		super(player, name);
		Genmenu();
	}
	public void Genmenu(){
		System.out.println("\t\t\t\t"+"---------------Tool Store-----------");
		charFutures();
		System.out.println("\t\t\t\tMoney balance: "+player.money);
		System.out.println("\t\t\t\t-----------------------------------------");

		System.out.println("\t\t\t\t"+"1 - Weapons");
		System.out.println("\t\t\t\t"+"2 - Armors");
		System.out.print("\t\t\t\t"+"Your Choice: ");
		int genCho = scan.nextInt();
		
		switch (genCho) {
		case 1:
			wMenu();
			break;
		case 2:
			aMenu();
			break;
		default:
			break;
		}		
	}
	
	public void wMenu()
	{
		System.out.println("\t\t\t\tMoney balance: "+player.money);
		System.out.println("\t\t\t\t-----------------------------------------");
		System.out.println("\t\t\t\t"+"-----------------------------------------");
		System.out.println("\t\t\t\t"+"No   Name   || Damage  ||  Cost");
		System.out.println("\t\t\t\t"+"-----------------------------------------");
		System.out.println("\t\t\t\t"+"1 - Pistol  ||   2     ||   25 ");
		System.out.println("\t\t\t\t"+"2 - Rifle   ||   3     ||   35 ");
		System.out.println("\t\t\t\t"+"3 - Saber   ||   7     ||   45 ");
		System.out.println("\t\t\t\t"+"-----------------------------------------");
		System.out.print("\t\t\t\t"+"Your choice: ");
		putWeapon();
		
	}
	
	public void aMenu()
	{
		System.out.println("\t\t\t\tMoney balance: "+player.money);
		System.out.println("\t\t\t\t-----------------------------------------");
		System.out.println("\t\t\t\t"+"-----------------------------------------");
		System.out.println("\t\t\t\t"+"No  Degree  || Protection  ||  Cost");
		System.out.println("\t\t\t\t"+"-----------------------------------------");
		System.out.println("\t\t\t\t"+"1 - Low     ||      1      ||   15 ");
		System.out.println("\t\t\t\t"+"2 - Middle  ||      3      ||   25 ");
		System.out.println("\t\t\t\t"+"3 - Strong  ||      5      ||   40 ");
		System.out.println("\t\t\t\t"+"-----------------------------------------");
		System.out.print("\t\t\t\t"+"Your choice: ");
		putArmor();
	
	}
	
	public void putWeapon()
	{
		int wCho = scan.nextInt();
		System.out.println("\t\t\t\t"+"-----------------------------------------");
		
		switch (wCho) {
		case 1:
			wCost = 25;
			sendInventoryWeapon("Pistol", 2);
			break;
		case 2:
			wCost = 35;
			sendInventoryWeapon("Rifle", 3);
			break;
		case 3:
			wCost = 45;
			sendInventoryWeapon("Saber", 7);
		default:
			break;
		}
		locationChoose();
	}
	
	public void putArmor()
	{
		int aCho = scan.nextInt();
		System.out.println("\t\t\t\t"+"-----------------------------------------");
		
		switch (aCho) {
		case 1:
			aCost = 15;
			sendInventoryArmor(1);
			break;
		case 2:
			aCost = 25;
			sendInventoryArmor(3);
			break;
		case 3:
			aCost = 40;
			sendInventoryArmor(5);
			break;
		default:
			break;
		}
		locationChoose();
	}
	
	public void sendInventoryWeapon(String wName,int Dmg)
	{
		if(player.getMoney()>=wCost)
		{
			player.money -= wCost;
			player.inv.setwName(wName);
			player.inv.setwDamage(player.inv.wDamage+Dmg);
			System.out.println("\t\t\t\t"+"Your money: " + player.money);
		}else {
			System.out.println("\t\t\t\t"+"You don't have enough money!");
			System.out.println("\t\t\t\t"+"-----------------------------------------");
		}
		locationChoose();		
	}
	
	public void sendInventoryArmor(int ahealth)
	{
		player.inv.setaHealth(player.inv.aHealth+ahealth);
	}
	

}
