package chapter3;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		String number = "0123456789";
		System.out.println(number.length());
		for(int i=0; i<number.length(); i++) {
			System.out.println(number.charAt(i));
		}
		
		String a = "aiguhaioudsikunrfikgjsoigjiojaoijgo;asejgojio";
		System.out.println(a.length());
		// for���� ����ؼ� a ��ü�� ����ִ� ���ڿ���
		// ó������ ������ �����ؼ� ����ϼ���.
		for(int i=0; i<a.length(); i++) {
			char monja = a.charAt(i);
			
			if(monja == 'a') {
				System.out.println(monja);
			}
		}
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("���ڿ� �Է� : ");
		String input = scanf.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			// input ���ڿ� �� ���鹮�ڸ� �����ϰ� ����ϴ� �ڵ�
			char monja = input.charAt(i);
			
			if(monja != ' ') {
				System.out.print(monja);
			}
		}
	}

}
