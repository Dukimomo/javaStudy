package chapter10;

public class Ex9 {
	
	int num1;
	
	static int num2;
	
	void instanceMemberMethod() {
		System.out.println("�ν��Ͻ� �ɹ� �޼���");
	}
	
	static void classMemberMethod() {
		System.out.println("Ŭ���� ��� �޼���");
	}
	public static void main(String[] args) {
		Ex9 ex9 = new Ex9();
		ex9.instanceMemberMethod();
		
		Ex9.classMemberMethod(); 
	}   
}
