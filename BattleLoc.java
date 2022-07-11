
public abstract class BattleLoc extends Location{
	Game g;
	EnemyPlace e;
	public BattleLoc(Player player, String name,EnemyPlace e) {
		super(player, name);
		this.e = e;
		enterBattle();
	}
	
	public void enterBattle() {
		
		
		System.out.println("\t\t\t\t"+"You are in "+ getName()+" now!");
		System.out.println("\t\t\t\t-----------------------------------------");

		charFutures();
		//System.out.println(player.getcName()+player.getPname());
		
			System.out.println("\t\t\t\t-----------------------------------------");
			System.out.print("\t\t\t\t"+"Do you want to fight? yes <Y> or no <N>");
			String choice = scan.nextLine();
			System.out.println("\t\t\t\t-----------------------------------------");
			choice = choice.toLowerCase();
			
			if(choice.equals("y"))
			{
				startBattle();
			}
			else {
				locationChoose();
			}
		}
	
	public void enemyInfo()
	{
		System.out.println("\t\t\t\t-----------------------------------------");
		System.out.println("\t\t\t\t"+"Enemy Damage: "+e.geteDamage());
		System.out.println("\t\t\t\t"+"Enemy Health: "+ e.geteHealth());
		System.out.println("\t\t\t\t"+"Bonuse Money: "+e.geteMoney());
		System.out.println("\t\t\t\t-----------------------------------------");
	}
	
	public void startBattle()
	{
		if(player.health>0)
		{
			enemyInfo();
			int earnMoney = 0;
			int newEnHealth;
		
			newEnHealth = e.geteHealth();
			System.out.println("\t\t\t\t"+"There is "+e.randCount+" "+e.geteName() );
			System.out.println("\t\t\t\t-----------------------------------------");
			while(player.health >0 && newEnHealth >0)
			{		
			
				//enemyInfo();
				System.out.println("\t\t\t\tHit or run?");
				System.out.print("\t\t\t\t<H>     <R>");
				System.out.print("\n\t\t\t\tRun --> -5 money!");
				String chc = scan.nextLine();
				chc = chc.toLowerCase();
				if(chc.equals("h"))
				{
					player.health -= (e.geteDamage()-player.inv.aHealth);
					newEnHealth -= (player.getDamage()+player.inv.wDamage);
					System.out.println("\t\t\t\t"+e.geteName()+":"+newEnHealth);
					System.out.println("\t\t\t\t"+player.getPname()+":"+player.health);
					
				}
				else 
				{
					player.money -= 5;
					locationChoose();
					break;
				}
			}
			
			if(newEnHealth<=0)
			{
				earnMoney += e.geteMoney();
				System.out.println("\t\t\t\t-----------------------------------------");
				System.out.println("\t\t\t\tYou win!");
				System.out.println("\t\t\t\t-----------------------------------------");
				if(player.money>=0)
				{
					if(name.equals("Cave"))
						player.inv.food = true;
					else if(name.equals("Forest"))
						player.inv.wood = true;
					else if(name.equals("River"))
						player.inv.water = true;
				}
			
				if(player.inv.food == true && player.inv.water == true  && player.inv.wood == true) {
					endGame();
				}else {			
					player.setMoney(player.getMoney()+earnMoney);
					System.out.println("\t\t\t\t"+"Your money: "+ player.getMoney());
					System.out.println("\t\t\t\t-----------------------------------------");
					locationChoose();
				}
			
			}else{
				endGame();
			}
			
		}
				
	}
	
	public void endGame()
	{
		if(player.health>0)
			System.out.println("\t\t\t\t"+"You are winner! you collect all of items!");
		else
			System.out.println("\t\t\t\t"+"Game over! you dead!");
	}
	
	
}
