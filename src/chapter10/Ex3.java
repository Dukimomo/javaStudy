package chapter10;

public class Ex3 {

	void simple4() {
		System.out.println("2021-03-14");
	}
		
	public static void main(String[] args) {
		Ex3 ex3 = new Ex3();
		Ex2 ex2 = new Ex2();
		
		// simple1 메서드 호출
		ex2.simple2();
		ex2.simple3();
			
		// simple1 메서드 호출
		ex3.simple4();
	}

}