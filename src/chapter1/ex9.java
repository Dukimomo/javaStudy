package chapter1;

public class ex9 {

	public static void main(String[] args) {
		char monja = 'A';
		int num = 20;
		
		// 문자를 정수로 변환(업캐스팅)
		int num2 = monja;
		
		// 정수를 실수로 변환(업캐스팅)
		float fNum2 = num;
		
		// 다운캐스팅
		char var = (char) num;
		
		// 실수 -> 정수로 형 변형
		// 다운캐스팅
		// 값의 변경 있음
		double a = 1.1414;
		int b = (int) a;
		
		// 정수 -> 실수로 형 변형
		// 업캐스팅
		// 값의 변경 없음
		int c = 1;
		double d = (double) c;
		
		// 문자 -> 정수로 형 변형
		// 업캐스팅
		// 값의 변경 있음
		
		char e = 'A';
		int f = (int) e;
		
		// 정수 -> 문자로 형 변형
		// 다운캐스팅
		// 값의 변경 있음
		int g = 100;
		char h = (char) g;
		
		System.out.println(3 + 10);
	
		int result = 3 + 10;
		System.out.println(result);
		
		int var1 = 3;
		result = var1 + 10;
		System.out.println(result);
		
		int var2 = 10;
		result = var1 + var2;
		System.out.println(result);
		
		System.out.println(3 + 10);
		System.out.println(3 - 10);
		System.out.println(3 * 10);
		System.out.println(3 / 10);
		System.out.println(3.0 / 10);
		System.out.println(3 % 10);
		
		// 철수의 국, 영, 수 합계
		int sum = 74 + 85 + 98;
		// 시험에 응시한 과목의 수
		int subject = 3;
		
		
		// 철수의 평균
		double avg = sum / (double) subject;
		
		System.out.println("철수의 총점 = " + sum);
		System.out.println("철수의 평균 = " + avg);
		
		System.out.println(0 % 3);
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
		int addResult = 1 + 1;
		System.out.println(addResult);
		
		double divResult = 10.0 / 3.0;
		System.out.println(divResult);
		
		System.out.println('0' + '1');
		
		int num1 = 31;
		num1 = num1 + 1;
		System.out.println(num1); 
		
		int add = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		System.out.println(add);
	}

}
