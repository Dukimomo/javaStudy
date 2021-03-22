package chapter3;

public class Ex14 {

	public static void main(String[] args) {
		// 초기석 자리에 선언한 변수는 for문에서만 사용할 수 있다.
		// 실행 순서 : 초기식 -> 조건식 -> 증감식 -> 조건식 -> 증감식 -> 조건식 -> ...
		for (int i=1; i<10; i++) {
			System.out.println(i);
		}
		
		int i = 27;
	}

}
