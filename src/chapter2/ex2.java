package chapter2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// 배열에 지정할 데이터의 갯수는 전통적으로 상수만 가능
		// 자바는 특별히 변수도 넣을 수 잇음
		// 컴파일 타임에 배열의 크기를 결정한다.
		char[] arr1 = new char[7];
		
		System.out.println("배열의 갯수 : ");
		
		Scanner scanf = new Scanner(System.in);
		
		int length = scanf.nextInt();
		// 런타임에 배열의 크기를 결정한다.
		// 동적 배열 생성
		char[] arr1_1 = new char[length];
		
		
		
	}

}
