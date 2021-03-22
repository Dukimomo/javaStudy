package chapter3;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// while문은 주로 조건 반복문 (끝이 명확하지 않은)
		Scanner scanf = new Scanner(System.in);
		// 음악을 다 듣고 다시 재생할지 여부
		char repeat;
	    
		while(true) {
			System.out.println("음악을 재생합니다.");
			int m = 1;
			while (m <= 10) {
				System.out.println(m + "번 트랙 재생");
				System.out.println("다시 처음부터 재생하시겠습니까?");
				repeat = scanf.next().charAt(0);
				
				if(repeat == 'y') {
					// 다시 처음부터 재생
					continue;
				}
				m += 1;
			}
			
			
			System.out.println("1번 트랙 재생");
			System.out.println("2번 트랙 재생");
			System.out.println("3번 트랙 재생");
			System.out.println("4번 트랙 재생");
			System.out.println("5번 트랙 재생");
			System.out.println("6번 트랙 재생");
			System.out.println("7번 트랙 재생");
			System.out.println("8번 트랙 재생");
			System.out.println("9번 트랙 재생");
			System.out.println("10번 트랙 재생");
			
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = scanf.next().charAt(0);
			
			if(repeat != 'y') {
				break;
			}
		}// end while
	}
}
