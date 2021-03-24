package chapter3;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// 아래와 같이 줄 수를 입력 받아 별(*)을 출력하세요.
		
		/*
		 * 줄 수: (일력) 3       줄 수 : 5
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
		
		System.out.println("줄 수 : ");
		int row = scanf.nextInt();
		
		// 줄 수를 관리하는 for문
		for(int i=1; i<=row; i++) {
			// n번째 줄에서 출력해야할 별의 개수를 관리하는 for문
			for(int j=1; j<=i; j++) {
				System.out.print('*');
			}
			
			System.out.println();;
		}// end for i
	}
}
