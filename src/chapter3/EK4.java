package chapter3;

import java.util.Scanner;

public class EK4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("ù ��° ���� �Է��ϼ���. : ");
		int num1= scanf.nextInt();
		
		System.out.println("�� ��° ���� �Է��ϼ���. : ");
		int num2= scanf.nextInt();
		
		System.out.println("�����ȣ�� �Է��ϼ���. : ");
		String operator= scanf.next();
		
		if(operator.equals("+")) {
			System.out.println(num1 + num2);
		} else if(operator.equals("-")) {
			System.out.println(num1 - num2);
		} else if(operator.equals("x")) {
			System.out.println(num1 * num2);
		} else if(operator.equals("/")) {
			System.out.println(num1 / num2);
		}
		
	}

}
