package chapter3;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// �Ʒ��� ���� �� ���� �Է� �޾� ��(*)�� ����ϼ���.
		
		/*
		 * �� ��: (�Ϸ�) 3       �� �� : 5
		 * 
		 * *                   *
		 * **                  **
		 * ***                 ***
		 *                     ****
		 *                     *****
		 *                     ******
		 *                     ******* 
		 */
//		int julsoo = 7;
//		
//		for(int i=1; i<= julsoo; i++) {
//			System.out.println('*');
//		}
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("�� �� : ");
		int row = scanf.nextInt();
		
		// �� ���� �����ϴ� for��
		for(int i=1; i<=row; i++) {
			// n��° �ٿ��� ����ؾ��� ���� ������ �����ϴ� for��
			for(int j=1; j<=i; j++) {
				System.out.print('*');
			}
			
			System.out.println();;
		}// end for i
	}
}
