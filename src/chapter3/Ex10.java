package chapter3;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanf = new Scanner (System.in);
		
		System.out.println("코리아 IT 자판기");
		System.out.println("1, 콜라");
		System.out.println("2. 환타");
		System.out.println("3. 사이다");
		System.out.println("4. 마운틴듀");
		System.out.println("자판기의 버튼을 누르세요 : ");
		
		int button  = scanf.nextInt();
		
		switch(button) {
		case 1: System.out.println("콜라"); break;
		case 2: System.out.println("환타"); break;
		case 3: System.out.println("사이다"); break;
		case 4: System.out.println("마운틴듀"); break;
		default: System.out.println("1에서 4의 숫자를 누르세요!");
		}
	}

}
