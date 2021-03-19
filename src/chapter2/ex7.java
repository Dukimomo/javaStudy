package chapter2;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr1 = new int[2][2];
//		
//		double[][] arr2 = new double[3][2];
//		
//		char[][] arr3 = new char[2][3];
		
		char[][] arr1 = new char[3][3];
		
		double[][] arr2 = new double[4][1]; 
		
		int[][] scores = {
			{84, 93, 52, 42},
			{62, 71, 79, 100},
			{55, 80, 33, 52}
		};
		
		int[][] student = {
			{84, 62, 55},
			{93, 71, 80},
			{52, 79, 33},
			{42, 100, 52}
		};
		
		System.out.println(student[0][0]);
		System.out.println(student[0][1]);
		System.out.println(student[0][2]);
		
		int kor1 = student[0][0];
		
		int[] student1 = student[0];
		System.out.println(student1[0]);
		System.out.println(student1[1]);
		System.out.println(student1[2]);
		
		int[][] studentInfo = new int[3][];
		studentInfo[0] = new int[3];
		studentInfo[1] = new int[5];
		studentInfo[2] = new int[1];
		
	}

}
