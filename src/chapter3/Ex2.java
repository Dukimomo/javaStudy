package chapter3;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 60;
		
		if(score >= 60) {
			System.out.println("통과");
		}
		
		double bmi = 20;
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}
		if(18.5 <= bmi && 22 > bmi) {
			System.out.println("정상");
		}
		if(22 <= bmi && 24 > bmi) {
			System.out.println("과체중 의심");
		}
		if(bmi >= 24 && bmi < 30) {
			System.out.println("비만");
		}
		if(bmi >= 30) {
			System.out.println("고도비만");
		}
	}

}
