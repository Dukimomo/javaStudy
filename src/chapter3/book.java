package chapter3;

public class book {
	
	public static void main(String[] args) {
		int book = 5;
		
		
		if(book >= 0) {
			switch(book) {
			case 0:
				System.out.println("���� �� �����ô°� ���ھ��!");
				break;
			case 1:
				System.out.println("�� ���̳� �����̱���!");
				break;
			case 2:
				System.out.println("å�� ����ϴ� ���̽ó׿�!");
				break;
			default:
				System.out.println("�ٵ����Դϴ�!"); 
			}
		}
		int chek = 50;
		
		chek = chek / 10;
		
		if(chek >= 0) {
			switch(chek) {
			case 0:
				System.out.println("���� �� ����ϼ���!");
				break;
			case 1:
				System.out.println("å �д� ���� ���� ���̽ó׿�!");
				break;
			case 2:
				System.out.println("å�� ����ϴ� ���̽ó׿�!");
				break;
			default:
				System.out.println("����� �ٵ����Դϴ�!");
			}
		}
		int number = 7;
		
		number = number % 2;
		
		switch(number) {
		case 0:
			System.out.println("¦���Դϴ�!");
			break;
		case 1:
			System.out.println("Ȧ���Դϴ�!");
			break;
		}
		int dayOfMonth = 28;
		int dayOfWeek = dayOfMonth % 7;
		
		switch(dayOfWeek) {
		case 0:
			System.out.println("�Ͽ���");
			break;
		case 1:
			System.out.println("������");
			break;
		case 2:
			System.out.println("ȭ����");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("�����");
			break;
		case 5:
			System.out.println("�ݿ���");
			break;
		case 6:
			System.out.println("�����");
			break;
		}
		
	}

}
