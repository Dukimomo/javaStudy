package chapter10;

public class Ex7 {
	// int -> add �ż��尡 �����ϰ� ���� ����� ���� �ᱣ���� ���� Ÿ���̶�� ��
	// add -> �ż����� �̸�
	// () -> �Ű������� �ʿ� ���� �ż���
	
	// ��ȯŸ��
	// - ���� : byte, short, int, long
	// - �Ǽ� : float, double
	// - ���� : char
	// - ���ڿ� : String
	// - �ν��Ͻ� : �ν��Ͻ��� �´� Ŭ������
	int add() {
		int result = 1 + 1;
		
		return result;
	}
	
	double div() {
		double result = 36 % 5;
		
		return result;
	}
	
	int stackAdd() {
		int sum = 0;
		for (int i=1; i<=5; i++) { 
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Ex7 ex7 = new Ex7();
		
		ex7.add();
		ex7.div();
		ex7.stackAdd();
	}
}
