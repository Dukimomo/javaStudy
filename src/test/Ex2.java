package test;

public class Ex2 {

	public static void main(String[] args) {
		// 같은 패키지에 있는 클래스 또는
		// 같은 패키지에 있는 자식 클래스가
		// 해당 멤버에 접근할 수 있도록 해주는 접근 제어자
		// protected
		
		// public - 일반적으로 메서드의 접근 권한을 public으로 설정
		// 			public static final 타입 변수이름
		// default
		// private - 일반적으로 변수의 접근 권한을 private으로 설정
		// protected
		Chapter12.Parent2 parent = new Chapter12.Parent2();
		
		System.out.println(parent.num);
	}

}
