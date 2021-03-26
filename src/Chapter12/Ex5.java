package Chapter12;

public class Ex5 {
	public static void main(String[] args) {
//		Car car = new Car();
//		FireEngine fe1 = (FireEngine) car;
//		FireEngine fe2 = (FireEngine) car;
		
		
//		Car car = null;
//		FireEngine fe1 = new FireEngine();
//		FireEngine fe2 = null;
//				
//		car = (Car) fe1;
//		fe2 = (FireEngine) car;
		
		FireEngine fe = new FireEngine();
		System.out.println(fe instanceof FireEngine);
		System.out.println(fe instanceof Car);
		System.out.println(fe instanceof Object);
		
		Car car = new Car();
		System.out.println(fe instanceof FireEngine);
		System.out.println(car instanceof Car);
		System.out.println(car instanceof Object);
	}

}
