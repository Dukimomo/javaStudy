package Chapter13;

public interface 인터페이스 {
	// 클래스(static) 상수(final) 맴버 변수 
	public static final int memVal1 = 10;
	
	static final int memVal2 = 20;
	
	final int memVal3 = 30;
	
	int memVal4 = 40;
	
	// 추상 매서드
	public abstract void memMethod1();
	
	abstract void memMethod2();
	
	void memMethod3(); 
}
