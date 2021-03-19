package chapter2;

import java.util.Arrays;


public class ex3 {
	public static void main(String[] args) {
		int[] korArr = new int[] {84, 93, 52, 42};
		System.out.println(Arrays.toString(korArr));
		
		
		double[] avgArr = {67, 81.3, 54.67, 64.67};
		System.out.println(Arrays.toString(avgArr));
		
		
		char[] gradeArr = {'B', 'A', 'C', 'B'};
		System.out.println(Arrays.toString(gradeArr));
		
		//가계부 작성 프로그램을 개발하려고한다. 가능한 모든 데이터를 적절한 타입의 배열에 저장하세요.
		
		String[] dateArr = {"3월 2일", "3월 3일", "3월 4일", "3월 5일", "3월 6일"};
		System.out.println(Arrays.toString(dateArr));
		
	    String[] priceArr = {"32159원", "25157원", "87982원", "40839원", "18908원"};
	    System.out.println(Arrays.toString(priceArr));
	    
	    char[] lvlArr = {'B', 'A', 'D', 'B', 'A'};
	    System.out.println(Arrays.toString(lvlArr));
	    
		
	}
}
