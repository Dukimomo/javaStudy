package Chapter12;

public class Child extends Parent {
	// �θ� Ŭ�����κ��� ��� ���� ������ �����ϴ� X
	public int x;
	public int y;
	
	public Child() {
		this(0, 0);
		
		System.out.println("�Ű������� ���� ������");
	}
	
	public Child(int x, int y) { 
		System.out.println("�Ű����� �ִ� ������");
		
		this.x = x;
		this.y = y;
	}
	
	// ��� ���迡���� �ڽ� Ŭ������ �⺻ �����ڴ�
	// �Ű������� ���� �θ� Ŭ������ �⺻ �����ڸ� ȣ���Ѵ�.
//	public Child(int x, int y) {
//		// �⺻ �����ڸ� ���� �߰��߰�
//		// �θ� Ŭ������ ���� �����ڸ� ȣ���ϴ� �ڵ带
//		// �ۼ����� �ʾҴ�.
//		System.out.println("�ڽ� Ŭ������ ������");
//		this.x = x;
//		this.y = y;
//	}
	public void method() {
	}
	
	public static void main(String[] args) {
		Child child = new Child();  
	}
}
