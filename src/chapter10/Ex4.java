package chapter10;

public class Ex4 {
	// simple1 �ż���� ���� 1���� �ʿ��� �ż���
	void simple1(int val) {
		System.out.println(val);
	}
	
	void simple2() {
		System.out.println("Hello World~!");
	}
	
	void simple3(String message) {
		System.out.println(message);
	}
	
	// simple4 �޼���� ���� �ΰ��� �ʿ��� �ż���
	void simple4(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}
	
	// simple5 �޼���� ���� �ΰ��� ���� �ϳ��� �ʿ��� �޼���
	void simple5(int var1, int var2, char var3) {
		if(var3 == '+') {
			System.out.println(var1 + var2);
		} else if(var3 == '-') {
			System.out.println(var1 - var2);
		} // ...
	}
	
	void simple6(int gugudan) {
		if (gugudan >= 2 && gugudan <= 9) {
			for(int i=1; i<=9; i++) {
				System.out.println(gugudan * i);
			}
		}
	}
	
	public static void main(String[] args) {
		Ex4 ex4 = new Ex4();
		
		ex4.simple1(1);
		
		ex4.simple2();
		ex4.simple2();
		ex4.simple2();
		ex4.simple2();
		
		ex4.simple3("Hello World~!");
		ex4.simple3("�ȳ��ϼ���");
		
		ex4.simple5(2, 5, '+');
		ex4.simple6(7);
	}
}
