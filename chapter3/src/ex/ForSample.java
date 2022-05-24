package ex;

public class ForSample {

	public static void main(String[] args) {
		int i, sum = 0; // 여기서 i를 선언하거나 for문에서 선언 할 수 있다.
		
		for(i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i;
			System.out.print(i);
			
			if(i<=9) { // 1~9까지는 '+' 출력
				System.out.print("+");
			} else {  // i가 10인 경우
				System.out.print("="); // '=' 출력
				System.out.print(sum); // 덧셈 결과 출력
			}
		}
	}

}
