package Chapter12;

public class Ex6 {

	public static void main(String[] args) {
		// 사과를 담을 수 있는 바구니를 만들어서 바구니에 사과를 담아보세요.
		Apple[] basket = new Apple[3];
		
		basket[0] = new Apple();
		
		// 바나나를 담을 수 있는 바구니를 만들어서 바구니에 바나나를 담아보세요.
		
		Banana[] hamper = new Banana[3];
		
		hamper[0] = new Banana();
		
		Onion[] onionBasket = new Onion[3];
		
		onionBasket[0] = new Onion();
		
		Sundry[] productbasket = new Sundry[3];
		
		productbasket[0] = new Fruit();
		productbasket[1] = new Veg();
		
		Fruit[] fruitshelf = new Fruit[3];
		
		fruitshelf[0] = new Apple();
		fruitshelf[1] = new Banana();
		
		Veg[] vegshelf = new Veg[3];
		
		vegshelf[0] = new Onion();
	}

}
