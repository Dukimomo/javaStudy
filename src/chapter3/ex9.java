package chapter3;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("ù ��° �� : ");
		int num1 = scanf.nextInt();
		
		System.out.println("�� ��° �� �Է� : ");
		int num2 = scanf.nextInt();
		
		System.out.println("������ : ");
		String operator = scanf.next();
		
		switch(operator) {
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + (num1+num2));
			break;
		default:
			System.out.println("+, -, *, / �� �Է��Ͻ� �� �ֽ��ϴ�.");
			
		}
	}
}


