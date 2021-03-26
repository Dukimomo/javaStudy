package Chapter12;

public class Zoo {
	public static void main(String[] args) {
		// 사육사 제임스를 생성
		ZooKeeper james = new ZooKeeper();
		
		// 사자에게 먹이를 주기
		Lion lion = new Lion();
		james.feed(lion);
		
		// 토끼에게 먹이를 주기
		rabbit rabbit = new rabbit();
		james.feed(rabbit);
		
		// 원숭이에게 먹이를 주기
		monkey monkey = new monkey();
		james.feed(monkey);
	}

}
