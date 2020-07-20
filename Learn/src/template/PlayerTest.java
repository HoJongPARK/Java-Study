package template;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player=new Player();
		
		player.play(1);
		Level aLevel=new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		Level sLevel=new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
