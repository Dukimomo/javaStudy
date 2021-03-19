package chapter1;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = true ? 1 : 2;
		int num2 = false ? 1 : 2;
		
		System.out.println(num1);
		System.out.println(num2);
		
		boolean button = true;
		
		String status = button ? "불이 켜졌습니다" : "불이 꺼졌습니다";
		
		System.out.println(status);
		
		//국어성적은 0 ~ 100점 사이입니다. 0 ~ 100점 사이를 입력했을 때는 "올바른 점수입니다"가 출력되고 그렇지 않을 때는 "점수가 잘못되었습니다"가 출력되도록 하세요.
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("국어 점수 : ");
		// 객체가 제공하는 기능 -> 메서드
		// nextInt 메서드 : 입력한 값을 정수로 가져오는 기능
		int kor = scanf.nextInt();
		System.out.println("kor = " + kor);
		
		boolean right = 0 <= kor && kor <= 100;
		
		String statute = right ? "올바른 점수입니다" : "점수가 잘못되었습니다";
		
		System.out.println(statute);
		
		/*
		 * 국어 성적이 50점 이상이면 "Pass"를 출력하고
		 * 국어 성적이 50점 미만이면 "Fail"를 출력하시오.
		 */
		
		boolean pass = kor >= 50;
		
		String passer = pass ? "Pass" : "Fail";
		
		System.out.println(passer);
	}

}
