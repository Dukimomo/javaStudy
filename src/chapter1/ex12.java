package chapter1;

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		int num1 = 27;
		
		System.out.println(num1 > 10);
		System.out.println(num1 != 5);
		
		System.out.println(num1 >= 27);
		System.out.println(num1 == 27);
		
		System.out.println(num1 < 30);
		System.out.println(num1 <= 27); 
		
		/*
		 * �� ������ : ����(true, false)�� �����ϱ� ���� ������
		 * && : �� �� ��� true �� �� ����� true
		 * || : �� �� �� �ϳ��� true�� ����� true
		 * !  : true�� false��, false�� true�� ���� �ݴ�� ������ִ� ������
		 */
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(!true);
		System.out.println(!false);
		
		/*
		 * ���� ��� ���α׷��� �����ϼ���.
		 * ���� ������ 0 ~ 100�� �����Դϴ�.
		 * ���� ������ �Է� �޾� ������ �������� ��ȯ���ּ���.
		 */
		// Scanner ��� �ٷ��� : �Է��� ���� �������� ����� ���� ����
		// ��� �ٷ��̸� ����Ϸ��� ��üȭ�� ���Ѿ���
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("���� ���� : ");
		// ��ü�� �����ϴ� ��� -> �޼���
		// nextInt �޼��� : �Է��� ���� ������ �������� ���
		int kor = scanf.nextInt();
		System.out.println("kor = " + kor);
		
		boolean right = 0 <= kor && kor <= 100;
		
		System.out.println(right);
		
		//�÷°˻�
		
		
	}

}
