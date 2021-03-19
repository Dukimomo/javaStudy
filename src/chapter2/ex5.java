package chapter2;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] avgArr = new double[4];
		avgArr[0] = 67;
		avgArr[1] = 81.3;
		avgArr[2] = 54.67;
		avgArr[3] = 64.67;
		
		avgArr[3] = avgArr[2];
		avgArr[2] = avgArr[1];		
		avgArr[1] = avgArr[0];
		avgArr[0] = 78.99;
		
		double avg = avgArr[0]; 
		
		int[] numArr = new int[8];
		numArr[0] = 2;
		numArr[1] = 4;
		numArr[2] = 6;
		numArr[3] = 8;
		int Varia = numArr[2];
		
		System.out.println(Varia);
	}

}
