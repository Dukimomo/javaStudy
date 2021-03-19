package chapter1;

import java.util.Scanner;

public class ㄷㅌ13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("시력 : ");
		
		//시력은 0.0 ~ 2.0까지 있습니다.
		// sight 변수에 시력을 저장하고 시력이 0.0 ~ 2.0 사이라면은 true, 그렇지 않다면 false를 출력하세요.
		double sight = scanf.nextDouble();

		// 객체가 제공하는 기능 -> 메서드
		// nextInt 메서드 : 입력한 값을 정수로 가져오는 기능
		System.out.println("시력 = " + sight);
		
		boolean right = 0.0 <= sight && sight <= 2.0;
		
		System.out.println(right);
		// || 해결
		boolean result1 = sight < 0.0;
		boolean result2 = sight > 2.0;
		boolean result = result1 || result2;
		
		System.out.println(result);
		// boolean 
	}

}
