package chapter10;

public class Ex8 {
	int add(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
	}
	int div(int num1, int num2) {
		int result = num1 / num2;
		
		return result;
	}
	int stackAdd(int n) {
		int result = 0;
		for (int i=n; i<=n; i++) {
			result += i;
		}
		return result;
	}
	double dublin(int num1, double single1) {
		return num1 + single1;
	}

	public static void main(String[] args) {
		Ex8 ex8 = new Ex8();
		
		int result = ex8.add(1,  1);
		System.out.println(result);
	}

}
