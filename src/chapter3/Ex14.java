package chapter3;

public class Ex14 {

	public static void main(String[] args) {
		// 초기석 자리에 선언한 변수는 for문에서만 사용할 수 있다.
		// 실행 순서 : 초기식 -> 조건식 -> 증감식 -> 조건식 -> 증감식 -> 조건식 -> ...
		for (int i=1; i<10; i++) {
			System.out.println(i);
		}
		
		// 1 ~ 10까지 짝수의 합
		
		// System.out.println(sum);
		
		// factorial - 순차곱셈
		// 1! = 1
		// n! = n * (n-1)!
		// 3! = 3 * 2 * 1
		// 5! = 5 * 4 * 3 * 2 * 1
		
		// n!을 반복문을 사용해서 구하세요
		
//		int fact = 1;
//		for(int i=5; i>=1; i = i - 1) {
//			fact = fact * i;
//		}
//		System.out.println(fact);
		
		int n = 10;
		int summy = 1;
		for(int i=n; i>=1; i--) {
			summy = summy * i;
		}
		
		System.out.println("순차곱 결과 = " + summy); 
		
		//1부터 10까지 하나씩 증가하는 하나의 for문에서 홀수, 짝수의 합을 구하세요.
		int sum1 = 0;
		int sum2 = 0;
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				sum2 += i;
			} else {
				sum1 += i;
			}
		} // end for i
		
		System.out.println();
	}

}
