package Chapter12;

public class Zoo {
	public static void main(String[] args) {
		// ������ ���ӽ��� ����
		ZooKeeper james = new ZooKeeper();
		
		// ���ڿ��� ���̸� �ֱ�
		Lion lion = new Lion();
		james.feed(lion);
		
		// �䳢���� ���̸� �ֱ�
		rabbit rabbit = new rabbit();
		james.feed(rabbit);
		
		// �����̿��� ���̸� �ֱ�
		monkey monkey = new monkey();
		james.feed(monkey);
	}

}
