package chapter1;

import java.util.Scanner;

public class ����13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("�÷� : ");
		
		//�÷��� 0.0 ~ 2.0���� �ֽ��ϴ�.
		// sight ������ �÷��� �����ϰ� �÷��� 0.0 ~ 2.0 ���̶���� true, �׷��� �ʴٸ� false�� ����ϼ���.
		double sight = scanf.nextDouble();

		// ��ü�� �����ϴ� ��� -> �޼���
		// nextInt �޼��� : �Է��� ���� ������ �������� ���
		System.out.println("�÷� = " + sight);
		
		boolean right = 0.0 <= sight && sight <= 2.0;
		
		System.out.println(right);
		// || �ذ�
		boolean result1 = sight < 0.0;
		boolean result2 = sight > 2.0;
		boolean result = result1 || result2;
		
		System.out.println(result);
		// boolean 
	}

}
