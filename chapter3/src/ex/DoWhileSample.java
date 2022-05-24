package ex;

public class DoWhileSample {

	public static void main(String[] args) {
		char a = 'a';
		
		do {
			System.out.print(a); // a = 98, 아스키코드인 98을 문자로 변형해주면 a이다.
			a = (char)(a + 1);
		} while(a <= 'z');
		System.out.println((char)('z' + 1));
		/*
		 * a = 'a', a = 98 + 1, a = (char)99
		 * a = 'b','b' <= 'z', a = 99 + 1, a = (char)100, a = 'c'
		 * ...
		 * a = 'z', 'z' <= 'z', a = 122 + 1, a = (char)123, a ='{'
		 */
	}

}
