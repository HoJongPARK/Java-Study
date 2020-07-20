package template;

public class Player {
	Level level;
	
	public Player() {
		level=new BegginerLevel();
		level.showLevelMessage();
	}
	
	public Level getLevel() {
		return level;
	}
	public void upgradeLevel(Level level) {
		this.level=level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
