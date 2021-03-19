package chapter3;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("첫 번째 수 입력 (0 <= x <= 100) : ");
		int num1 = scanf.nextInt();
		
		System.out.println("두 번째 수 입력 (0 <= x <= 100) : ");
		int num2 = scanf.nextInt();
		
		if((0 <= num1 && num1 <= 100) && (0 <= num2 && num2 <= 100)) {
			if(num1 >= num2) {
				System.out.println(num1);
			} else {
				System.out.println(num2);
			}
		} else {
			System.out.println("0 ~ 100");
		}
	}

}
