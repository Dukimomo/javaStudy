package chapter3;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		
		if(num == 1) {
			System.out.println("1�Դϴ�.");
		} else if(num == 2) {
			System.out.println("2�Դϴ�.");
		} else if(num == 3) {
			System.out.println("3�Դϴ�.");
		} else if(num == 4) {
			System.out.println("4�Դϴ�.");
		}
		
		int age = 21;
		
		if(age > 1 && age < 8) {
			System.out.println("�ֱ�");
		} else if(age > 7 && age < 14) {
			System.out.println("�ʵ�");
		} else if(age > 13 && age < 17) {
			System.out.println("�ߵ��");
		} else if(age > 16 && age < 20) {
			System.out.println("��ȫ��");
		} else {
			System.out.println("���л�");
		}
	} 

}
