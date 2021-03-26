package Chapter13;

public class Lion extends Animal{
	public Lion() {
		super("사자");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getMyName() + "이(가) 네발로 달립니다.");
	}

	@Override
	public void findFood() {
		System.out.println("사냥감을 쫓아가 잡았습니다.");
	}

	@Override
	public void eatFood() {
		System.out.println("사냥감을 와구와구 먹습니다.");
	}
	
	
}
