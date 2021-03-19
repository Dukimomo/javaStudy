package chapter1;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 출력 대상을 출력하는 기능
		// 출력 대상은 값만 가능하다.		
		System.out.println();
		
		char value = 'A';
		System.out.println(value);
		
		int number = 10;
		System.out.println(number);
		
		double data = -17.1;
		System.out.println(data);
		
		boolean val1 = true;
		System.out.println(val1);
		
		double num1 = 3.14;
		
		char num2 = 'Z';
		
		boolean num3 = false;
		
		int num4 = 100;
		
		// 변수명은 영문자, 숫자 특수문자($, _)만 사용할 수 있다.
		int word;
		int word1;
		int word$;
		int word_;
		
		// 변수명의 시작은 영문자, 특수문자만 가능하다.
		int _word;
		int $word;
		
		// 변수명은 영문 대솝문자를 구분한다.
		int apple = 17;
		int Apple = 27;
		
		System.out.println(apple);
		System.out.println(Apple);
		
		// 변수명은 기워드를 사용할 수 없다.
		// 키워드 - 영단어이기는 하지만 자바가 미리 선점한 영단어
		
		// 변수는 중복해서 선언할 수 없다.
		int apple1 = 17;
		apple1 = 27;
		
		// 카멜표기법(낙타표기법)
		int myAge;
		
		char myGrade;
		
		byte number1 = 127;
		
		short number2 = -129;
		
		int number3 = 32768;
		
		int num = 704;
		int temp;
		temp = num;
		
		temp = 59;
		System.out.println(temp);
		
		double fnum = 70.4;
		
		float number4 = 1.2345f;
		
		double d_value = 3.14;
		d_value = 7.81;
		
		long num5 = 704l;
		
		char monja1 = 'a';
		System.out.println(monja1);
		
		char monja2 = 65;
		System.out.println(monja2);
		
//		String var1 = "ABCDEFG";
//		String var2 = "안녕하세요";
//		
//		System.out.println(var1);
//		System.out.println(var2);
		
		char var1 = 'A';
		
		char var2 = '1';
	    int var3 = 1;
	    
	    System.out.println(var2-1);
	    System.out.println(var3-1);
	    
	    String var2_1 = "코리아IT아카데미";
	    String today = "2021-03-16";
	    today = "2021-03-17";
	    
	    boolean bool = true;
	    System.out.println(bool);
	    
	    bool = false;
	    System.out.println(bool);
	    
	    // 정수 : byte, short, int, long
	    // 실수 : float, double
	    // 문자 : char
	    // 문자열 : string
	    // 논리값 : boolean
	    
	    // 기본 데이터타입과 사용자 정의 데이터타입
	    // 기본 데이터타입 - 자바 개발자가 만들어준 데이터의 형태
	    // 사용자 정의 데이터타입 - 우리같은 개발자가 필요에의해서 만든 데이터 타입
	    
	    // 기본 데이터타입 - 문자열을 뺀 8개 데이터 타입
	    // 사용자 정의 데이터타입 - String
	    
	    // 기본 데이터타입은 대입 연산자만을 사용해서 데이터를 저장할 수 있다.
	    // 사용자 정의 데이터타입은 대입 연산자와 new연산자를 사용해야 데이터를 저장할 수 있다.
	    
	    
	    String var4 = "코리아IT아카데미";
	    String var5 = new String("코리아IT아카데미");
	}

}
