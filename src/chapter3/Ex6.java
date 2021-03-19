package chapter3;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		
		if(num == 1) {
			System.out.println("1입니다.");
		} else if(num == 2) {
			System.out.println("2입니다.");
		} else if(num == 3) {
			System.out.println("3입니다.");
		} else if(num == 4) {
			System.out.println("4입니다.");
		}
		
		int age = 21;
		
		if(age > 1 && age < 8) {
			System.out.println("애기");
		} else if(age > 7 && age < 14) {
			System.out.println("초딩");
		} else if(age > 13 && age < 17) {
			System.out.println("중등래퍼");
		} else if(age > 16 && age < 20) {
			System.out.println("양홍원");
		} else {
			System.out.println("대학생");
		}
	} 

}
