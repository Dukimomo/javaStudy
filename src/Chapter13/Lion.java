package Chapter13;

public class Lion extends Animal{
	public Lion() {
		super("����");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getMyName() + "��(��) �׹߷� �޸��ϴ�.");
	}

	@Override
	public void findFood() {
		System.out.println("��ɰ��� �Ѿư� ��ҽ��ϴ�.");
	}

	@Override
	public void eatFood() {
		System.out.println("��ɰ��� �ͱ��ͱ� �Խ��ϴ�.");
	}
	
	
}