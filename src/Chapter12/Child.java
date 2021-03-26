package Chapter12;

public class Child extends Parent {
	// 부모 클래스로부터 상속 받은 정수를 저장하는 X
	public int x;
	public int y;
	
	public Child() {
		this(0, 0);
		
		System.out.println("매개변수가 없는 생성자");
	}
	
	public Child(int x, int y) { 
		System.out.println("매개변수 있는 생성자");
		
		this.x = x;
		this.y = y;
	}
	
	// 상속 관계에서는 자식 클래스의 기본 생성자는
	// 매개변수는 없고 부모 클래스의 기본 생성자를 호출한다.
//	public Child(int x, int y) {
//		// 기본 생성자를 직접 추가했고
//		// 부모 클래스의 가본 생성자를 호출하는 코드를
//		// 작성하지 않았다.
//		System.out.println("자식 클래스의 생성자");
//		this.x = x;
//		this.y = y;
//	}
	public void method() {
	}
	
	public static void main(String[] args) {
		Child child = new Child();  
	}
}
