package chapter10;

public class Ex7 {
	// int -> add 매서드가 동작하고 나서 만들어 내는 결괏값이 정수 타입이라는 것
	// add -> 매서드의 이름
	// () -> 매개변수가 필요 없는 매서드
	
	// 반환타입
	// - 정수 : byte, short, int, long
	// - 실수 : float, double
	// - 문자 : char
	// - 문자열 : String
	// - 인스턴스 : 인스턴스에 맞는 클래스명
	int add() {
		int result = 1 + 1;
		
		return result;
	}
	
	double div() {
		double result = 36 % 5;
		
		return result;
	}
	
	int stackAdd() {
		int sum = 0;
		for (int i=1; i<=5; i++) { 
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Ex7 ex7 = new Ex7();
		
		ex7.add();
		ex7.div();
		ex7.stackAdd();
	}
}
