package chapter3;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 60;
		
		if(score >= 60) {
			System.out.println("���");
		}
		
		double bmi = 20;
		
		if(bmi < 18.5) {
			System.out.println("��ü��");
		}
		if(18.5 <= bmi && 22 > bmi) {
			System.out.println("����");
		}
		if(22 <= bmi && 24 > bmi) {
			System.out.println("��ü�� �ǽ�");
		}
		if(bmi >= 24 && bmi < 30) {
			System.out.println("��");
		}
		if(bmi >= 30) {
			System.out.println("����");
		}
	}

}
