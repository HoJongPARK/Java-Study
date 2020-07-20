package template;

public class BegginerLevel extends Level {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("비기너레벨이 달린다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("비기너는 점프할 줄 모른다.");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("비기너는 턴할줄 모른다");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("나는 비기너다");
	}
	
}
