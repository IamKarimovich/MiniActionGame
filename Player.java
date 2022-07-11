import java.util.Scanner;

public class Player {
	Scanner scan = new Scanner(System.in);
	
	Inventory inv;
	private String Pname,cName;
	private int damage,rHealth;
	private int chaCho;
	public int health,money;
	
	public Player() {
		super();
		this.inv = new Inventory();;
	}

	public void selCha()
	{
		switch (MenuOfCha()) {
		case 1:
			setFutures("Samurai", 21, 5, 15);
			break;
		case 2:
			setFutures("Knight", 24, 8, 105);
			break;
		case 3:
			setFutures("Archer", 18, 7, 20);
			break;
		default:
			setFutures("Samurai", 21, 5, 15);
			break;
		}	
	}
	
	public int MenuOfCha()
	{
		System.out.println("\t\t\t\t-----------------------------------------");
		System.out.println("\t\t\t\tNo   Name   || Health  || Damage ||Money");
		System.out.println("\t\t\t\t-----------------------------------------");
		System.out.println("\t\t\t\t1 - Samurai ||   21    ||    5   ||  15");
		System.out.println("\t\t\t\t2 - Knight  ||   24    ||    8   ||  5");
		System.out.println("\t\t\t\t3 - Archer  ||   18    ||    7   ||  20");
		System.out.println("\t\t\t\t-----------------------------------------");
		System.out.print("\t\t\t\tYour choice: ");
		chaCho = scan.nextInt();
		System.out.println("\t\t\t\t-----------------------------------------");
			
		return chaCho;
		
	}
	
	
	
	public void setFutures(String cName,int health,int damage,int money)
	{
		this.cName = cName;
		this.health = health;
		this.damage = damage;
		this.money = money;
		this.rHealth = health;
	}

	public int getrHealth() {
		return rHealth;
	}

	public void setrHealth(int rHealth) {
		this.rHealth = rHealth;
	}

	public Player(String pname) {
		Pname = pname;
	}
	public Inventory getInv() {
		return inv;
	}
	public void setInv(Inventory inv) {
		this.inv = inv;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	
	
	
	
	
}
