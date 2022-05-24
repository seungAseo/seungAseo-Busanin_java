package ex;

public class PlusMinus {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int result1 = ++x + 10; // x = 2  , result1 = 2 + 10 =12
		int result2 = y++ + 10; // y = 1 , result2 = 1 + 10 =11
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		int a = 3
				
				
				, d = 3;
		
		a = d++;	// a = 3, d = 4
		System.out.println("a = " + a + ", d = " + d);
		a = ++d;	// d = 5, a = 5
		System.out.println("a = " + a + ", d = " + d);
		a = d--;	// a = 5, d = 4
		System.out.println("a = " + a + ", d = " + d);
		a = --d;	// d = 3, a = 3
		System.out.println("a = " + a + ", d = " + d);
		
	}

}
