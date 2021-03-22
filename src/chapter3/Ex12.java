package chapter3;

public class Ex12 {
	public static void main(String[] args) {
		System.out.println("구구단 2단...");
		
		int j = 2;
		
		while(j <= 5) { 
			int i = 1;
			
			while(i <= 9) {
				System.out.println(j + "* " + i + " = " + (j*i));
				
				i += 1;
			}// end while i
			j = j + 1;
		}// end while j
		
		
	}

}

//int i = 11;
//
//while(i >= 1) {
//	i = i - 2;
//	
//	System.out.println(i);
//	
//	i = i - 2;
