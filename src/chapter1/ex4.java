package chapter1;

public class ex4 {

	public static void main(String[] args) {
		int num1 = 20;
		double num2 = 17.3149;

		System.out.println((double) num1);
		System.out.println((int) num2);
		
		double num3 = (double) num1;
		int num4 = (int) num2;
		
		System.out.println(num3);
		System.out.println(num4);
		
		byte value1 = 127;
		int value5 = (int) value1;
		
		int value2 = 32768;
		short value6 = (short) value2;
		
		float value3 = 95.7f;
		double value7 = (double) value3;
		
		double value4 = 179.8;
		float value8 = (float) value4;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
	}

}
