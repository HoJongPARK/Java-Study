package template;

public class AdvancedLevel extends Level {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("슈퍼레벨이 달린다!");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("슈퍼레벨이 점프한다!");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("슈퍼레벨은 턴 할줄 모른다..");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("나는 슈퍼레벨이다");
	}

}
