package repeat;

public class Loop_Rex1 {

	public static void main(String[] args) {
		/*
		반복문 문제
		1. for문을 이용해서 다음과 같이 *를 출력하는 코드를 작성하세요.
		*
		**
		***
		****
		*/
		/*
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				if(i == j) {
					System.out.println();
				}
			}			
		}
 		*/
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
					
				}
				System.out.println();
			}			
	}

}
