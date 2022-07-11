
public class Main {

	public static void main(String[] args) {
		
		Player player = new Player();
		Inventory inv = new Inventory();
		EnemyPlace enemy = new EnemyPlace() {
		};

		
		System.out.println("\t\t\t\tWelcome to Action Game!\n\t\t\t\tGood luck!");
		Game g = new Game(player,inv,enemy);
		g.start();
		
	}

}
