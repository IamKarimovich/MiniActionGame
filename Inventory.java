
public class Inventory {

	
	protected boolean wood;
	protected boolean water;
	protected boolean food;
	protected int wDamage,aHealth;
	protected String wName,aName;
	
	public Inventory() {
		this.wood = false;
		this.water = false;
		this.food = false;
		this.wDamage = 0;
		this.aHealth = 0;
		this.wName = null;
		this.aName = null;
	}
	
	public boolean isWood() {
		return wood;
	}
	public void setWood(boolean wood) {
		this.wood = wood;
	}
	public boolean isWater() {
		return water;
	}
	public void setWater(boolean water) {
		this.water = water;
	}
	public boolean isFood() {
		return food;
	}
	public void setFood(boolean food) {
		this.food = food;
	}
	public int getwDamage() {
		return wDamage;
	}
	public void setwDamage(int wDamage) {
		this.wDamage = wDamage;
	}
	public int getaHealth() {
		return aHealth;
	}
	public void setaHealth(int aHealth) {
		this.aHealth = aHealth;
	}

	public String getwName() {
		return wName;
	}

	public void setwName(String wName) {
		this.wName = wName;
	}
	
	
	
	
	
	
	
}
