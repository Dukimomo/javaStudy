package chapter1;

public class ex11 {

	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1++);
		
		num1 = num1 + 10;
		System.out.println(++num1);
		
		num1 = num1 - 7;
		System.out.println(--num1);
		
		num1 = num1 * 2;
		System.out.println(num1--);
		
		double fNum = num1 / 4.0;
		System.out.println(--fNum);
		
		num1 = num1 % 12;
		System.out.println(++num1);
		
		boolean result = 10 == 10;
		System.out.println(result);
		
		System.out.println(24 != 10);
		
		System.out.println(17 > 32);
		
		System.out.println(17 >= 17);
		
		System.out.println(17 < 32);
		
		System.out.println(17 <= 17);
		
		char monja1 = 'a';
		char monja2 = 'a';
		
		System.out.println(monja1 == monja2);
		
		System.out.println(monja1 != monja2);
		
		System.out.println(monja1 > monja2);
		
		System.out.println(monja1 >= monja2);
		
		System.out.println(monja1 < monja2);
		
		System.out.println(monja1 <= monja2);
		
		String monja3 = "apple";
		String monja4 = "banana";
		
		// 실제 값 == 메모리 주소임 :)
		System.out.println(monja3 == monja4);
		System.out.println(monja3 != monja4);
		
		
		
		// num1 = num1 + 1;
		// num1 += 1;
		// num1++;
//		++num1;
//		System.out.println(num1);
//		num1 = num1 + 1;
//		System.out.println(num1);
//		System.out.println(++num1);
		
//		System.out.println(num1);
//		num1 = num1 + 1;		
//		System.out.println(num1++);
		// num1 = num1 - 1;
		// num1 -= 1;
		// num1--;
//		--num1;
//		System.out.println(num1);
		

	}

}
