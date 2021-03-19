package chapter3;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers numbers = new Numbers();
		numbers.num1 = 1_000_000;
		numbers.num2 = numbers.num1;
		
		int var = numbers.num1 * numbers.num2;
		System.out.println(var);
	}

}
