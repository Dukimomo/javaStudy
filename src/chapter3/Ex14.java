package chapter3;

public class Ex14 {

	public static void main(String[] args) {
		// �ʱ⼮ �ڸ��� ������ ������ for�������� ����� �� �ִ�.
		// ���� ���� : �ʱ�� -> ���ǽ� -> ������ -> ���ǽ� -> ������ -> ���ǽ� -> ...
		for (int i=1; i<10; i++) {
			System.out.println(i);
		}
		
		// 1 ~ 10���� ¦���� ��
		
		// System.out.println(sum);
		
		// factorial - ��������
		// 1! = 1
		// n! = n * (n-1)!
		// 3! = 3 * 2 * 1
		// 5! = 5 * 4 * 3 * 2 * 1
		
		// n!�� �ݺ����� ����ؼ� ���ϼ���
		
//		int fact = 1;
//		for(int i=5; i>=1; i = i - 1) {
//			fact = fact * i;
//		}
//		System.out.println(fact);
		
		int n = 10;
		int summy = 1;
		for(int i=n; i>=1; i--) {
			summy = summy * i;
		}
		
		System.out.println("������ ��� = " + summy); 
		
		//1���� 10���� �ϳ��� �����ϴ� �ϳ��� for������ Ȧ��, ¦���� ���� ���ϼ���.
		int sum1 = 0;
		int sum2 = 0;
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				sum2 += i;
			} else {
				sum1 += i;
			}
		} // end for i
		
		System.out.println();
	}

}
