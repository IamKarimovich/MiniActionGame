import java.util.Random;

public abstract class EnemyPlace {
	Random rand = new Random();
	
	private String eName;
	private int eHealth,eMoney,eDamage;
	private int eCount,eID;
	int[] randArray = new int[]{1,2,3};
	
	public int randNum = rand.nextInt(3);

	public int randCount = randArray[randNum];
	
	
	public EnemyPlace(){
		this.eName = null;
		this.eHealth = 0;
		this.eMoney = 0;
		this.eDamage = 0;
		this.eID = 0;
	}
	
	public void sendEnemyInfo(String eName,int eDamage,int eHealth,int eMoney)
	{
		seteName(eName);
		seteDamage(eDamage);
		seteHealth(eHealth);
		seteMoney(eMoney);
		//enemyInfo(eName, eDamage, eHealth, eMoney);
	}
	
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteCount() {
		return eCount;
	}

	public int geteID() {
		return eID;
	}

	public int geteHealth() {
		return eHealth;
	}

	public void seteHealth(int eHealth) {
		this.eHealth = eHealth;
	}

	public int geteMoney() {
		return eMoney;
	}

	public void seteMoney(int eMoney) {
		this.eMoney = eMoney;
	}

	public int geteDamage() {
		return eDamage;
	}

	public void seteDamage(int eDamage) {
		this.eDamage = eDamage;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	
	
	
}
