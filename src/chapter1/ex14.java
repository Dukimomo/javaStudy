package chapter1;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = true ? 1 : 2;
		int num2 = false ? 1 : 2;
		
		System.out.println(num1);
		System.out.println(num2);
		
		boolean button = true;
		
		String status = button ? "���� �������ϴ�" : "���� �������ϴ�";
		
		System.out.println(status);
		
		//������� 0 ~ 100�� �����Դϴ�. 0 ~ 100�� ���̸� �Է����� ���� "�ùٸ� �����Դϴ�"�� ��µǰ� �׷��� ���� ���� "������ �߸��Ǿ����ϴ�"�� ��µǵ��� �ϼ���.
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("���� ���� : ");
		// ��ü�� �����ϴ� ��� -> �޼���
		// nextInt �޼��� : �Է��� ���� ������ �������� ���
		int kor = scanf.nextInt();
		System.out.println("kor = " + kor);
		
		boolean right = 0 <= kor && kor <= 100;
		
		String statute = right ? "�ùٸ� �����Դϴ�" : "������ �߸��Ǿ����ϴ�";
		
		System.out.println(statute);
		
		/*
		 * ���� ������ 50�� �̻��̸� "Pass"�� ����ϰ�
		 * ���� ������ 50�� �̸��̸� "Fail"�� ����Ͻÿ�.
		 */
		
		boolean pass = kor >= 50;
		
		String passer = pass ? "Pass" : "Fail";
		
		System.out.println(passer);
	}

}
