package chapter3;

public class book {
	
	public static void main(String[] args) {
		int book = 5;
		
		
		if(book >= 0) {
			switch(book) {
			case 0:
				System.out.println("조금 더 읽으시는게 좋겠어요!");
				break;
			case 1:
				System.out.println("한 권이나 읽으셨군요!");
				break;
			case 2:
				System.out.println("책을 사랑하는 분이시네요!");
				break;
			default:
				System.out.println("다독왕입니다!"); 
			}
		}
		int chek = 50;
		
		chek = chek / 10;
		
		if(chek >= 0) {
			switch(chek) {
			case 0:
				System.out.println("조금 더 노력하세요!");
				break;
			case 1:
				System.out.println("책 읽는 것을 즐기는 분이시네요!");
				break;
			case 2:
				System.out.println("책을 사랑하는 분이시네요!");
				break;
			default:
				System.out.println("당신은 다독왕입니다!");
			}
		}
		int number = 7;
		
		number = number % 2;
		
		switch(number) {
		case 0:
			System.out.println("짝수입니다!");
			break;
		case 1:
			System.out.println("홀수입니다!");
			break;
		}
		int dayOfMonth = 28;
		int dayOfWeek = dayOfMonth % 7;
		
		switch(dayOfWeek) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		}
		
	}

}
