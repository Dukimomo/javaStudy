package Chapter12;

public class Ex4 {
	public static void main(String[] args) {
		TV tv = new TV();

		CaptionTV captionTV = new CaptionTV();
		
		// 다형성 = tv2 라는 객체는 TV 타입의 객체이면서
		// 		  TV 클래스의 자식 클래스인 CaptionTV 타입의 객체도 된다.
		TV tv2 = new CaptionTV();
		
		CaptionTV captionTV2 = new TV()
		
		// 단, 자식 타입의 객체가 부모 타입의 인스턴스를 가리킬 수는 없음
//		CaptionTV captionTV2 = new TV();

	}
}
