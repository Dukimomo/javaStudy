package chapter1;

public class ex9 {

	public static void main(String[] args) {
		char monja = 'A';
		int num = 20;
		
		// ���ڸ� ������ ��ȯ(��ĳ����)
		int num2 = monja;
		
		// ������ �Ǽ��� ��ȯ(��ĳ����)
		float fNum2 = num;
		
		// �ٿ�ĳ����
		char var = (char) num;
		
		// �Ǽ� -> ������ �� ����
		// �ٿ�ĳ����
		// ���� ���� ����
		double a = 1.1414;
		int b = (int) a;
		
		// ���� -> �Ǽ��� �� ����
		// ��ĳ����
		// ���� ���� ����
		int c = 1;
		double d = (double) c;
		
		// ���� -> ������ �� ����
		// ��ĳ����
		// ���� ���� ����
		
		char e = 'A';
		int f = (int) e;
		
		// ���� -> ���ڷ� �� ����
		// �ٿ�ĳ����
		// ���� ���� ����
		int g = 100;
		char h = (char) g;
		
		System.out.println(3 + 10);
	
		int result = 3 + 10;
		System.out.println(result);
		
		int var1 = 3;
		result = var1 + 10;
		System.out.println(result);
		
		int var2 = 10;
		result = var1 + var2;
		System.out.println(result);
		
		System.out.println(3 + 10);
		System.out.println(3 - 10);
		System.out.println(3 * 10);
		System.out.println(3 / 10);
		System.out.println(3.0 / 10);
		System.out.println(3 % 10);
		
		// ö���� ��, ��, �� �հ�
		int sum = 74 + 85 + 98;
		// ���迡 ������ ������ ��
		int subject = 3;
		
		
		// ö���� ���
		double avg = sum / (double) subject;
		
		System.out.println("ö���� ���� = " + sum);
		System.out.println("ö���� ��� = " + avg);
		
		System.out.println(0 % 3);
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
		int addResult = 1 + 1;
		System.out.println(addResult);
		
		double divResult = 10.0 / 3.0;
		System.out.println(divResult);
		
		System.out.println('0' + '1');
		
		int num1 = 31;
		num1 = num1 + 1;
		System.out.println(num1); 
		
		int add = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		System.out.println(add);
	}

}
