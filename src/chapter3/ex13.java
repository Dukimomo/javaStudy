package chapter3;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// while���� �ַ� ���� �ݺ��� (���� ��Ȯ���� ����)
		Scanner scanf = new Scanner(System.in);
		// ������ �� ��� �ٽ� ������� ����
		char repeat;
	    
		while(true) {
			System.out.println("������ ����մϴ�.");
			int m = 1;
			while (m <= 10) {
				System.out.println(m + "�� Ʈ�� ���");
				System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
				repeat = scanf.next().charAt(0);
				
				if(repeat == 'y') {
					// �ٽ� ó������ ���
					continue;
				}
				m += 1;
			}
			
			
			System.out.println("1�� Ʈ�� ���");
			System.out.println("2�� Ʈ�� ���");
			System.out.println("3�� Ʈ�� ���");
			System.out.println("4�� Ʈ�� ���");
			System.out.println("5�� Ʈ�� ���");
			System.out.println("6�� Ʈ�� ���");
			System.out.println("7�� Ʈ�� ���");
			System.out.println("8�� Ʈ�� ���");
			System.out.println("9�� Ʈ�� ���");
			System.out.println("10�� Ʈ�� ���");
			
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = scanf.next().charAt(0);
			
			if(repeat != 'y') {
				break;
			}
		}// end while
	}
}
