package chapter10;

public class Ex9 {
	
	int num1;
	
	static int num2;
	
	void instanceMemberMethod() {
		System.out.println("인스턴스 맴버 메서드");
	}
	
	static void classMemberMethod() {
		System.out.println("클래스 멤버 메서드");
	}
	public static void main(String[] args) {
		Ex9 ex9 = new Ex9();
		ex9.instanceMemberMethod();
		
		Ex9.classMemberMethod(); 
	}   
}
