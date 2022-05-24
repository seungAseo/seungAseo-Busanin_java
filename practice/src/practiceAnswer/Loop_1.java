package practiceAnswer;

public class Loop_1 {

	public static void main(String[] args) {
		/*
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
