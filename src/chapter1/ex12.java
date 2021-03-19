package chapter1;

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		int num1 = 27;
		
		System.out.println(num1 > 10);
		System.out.println(num1 != 5);
		
		System.out.println(num1 >= 27);
		System.out.println(num1 == 27);
		
		System.out.println(num1 < 30);
		System.out.println(num1 <= 27); 
		
		/*
		 * 논리 연산자 : 논리값(true, false)를 연산하기 위한 연산자
		 * && : 두 값 모두 true 일 때 결과가 true
		 * || : 두 값 중 하나만 true만 결과가 true
		 * !  : true를 false로, false를 true로 값을 반대로 만들어주는 연산자
		 */
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(!true);
		System.out.println(!false);
		
		/*
		 * 성적 계산 프로그램을 개발하세요.
		 * 국어 성적은 0 ~ 100점 사이입니다.
		 * 국어 성적을 입력 받아 적절한 학점으로 변환해주세요.
		 */
		// Scanner 기능 꾸러미 : 입력을 위한 여러가지 기능을 갖고 있음
		// 기능 꾸러미를 사용하려면 구체화를 시켜야함
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("국어 점수 : ");
		// 객체가 제공하는 기능 -> 메서드
		// nextInt 메서드 : 입력한 값을 정수로 가져오는 기능
		int kor = scanf.nextInt();
		System.out.println("kor = " + kor);
		
		boolean right = 0 <= kor && kor <= 100;
		
		System.out.println(right);
		
		//시력검사
		
		
	}

}
