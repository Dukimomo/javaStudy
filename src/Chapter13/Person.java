package Chapter13;

public class Person extends Animal{
	public Person() {
		super("���");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getMyName() + "��(��) �ι߷� �޸��ϴ�.");
	}

	@Override
	public void findFood() {
		System.out.println("��޾����� ������ �ֹ��մϴ�.");
	}

	@Override
	public void eatFood() {
		System.out.println("������ ���ϰ� �Խ��ϴ�.");
	}
}