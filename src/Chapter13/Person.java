package Chapter13;

public class Person extends Animal{
	public Person() {
		super("사람");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getMyName() + "이(가) 두발로 달립니다.");
	}

	@Override
	public void findFood() {
		System.out.println("배달앱으로 음식을 주문합니다.");
	}

	@Override
	public void eatFood() {
		System.out.println("음식을 어마어마하게 먹습니다.");
	}
}