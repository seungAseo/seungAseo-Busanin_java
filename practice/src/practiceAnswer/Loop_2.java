package practiceAnswer;

public class Loop_2 {

	public static void main(String[] args) {
		/*
		2. for문을 이용해서 다음과 같이 *를 출력하는 코드를 작성하세요.
		   *
		  **
		 ***
		****
		*/
		for(int i = 1; i <= 4; i++) {
			for(int j = 4; j > 0; j--) {
				if(i < j) {
					System.out.print(" ");
				} else {	// i >= j
					System.out.print("*");
				}
				/*
				i = 1, j = 4, 1 < 4~2 -> " ", 1 >= 1   -> "*"
				i = 2, j = 4, 2 < 4~3 -> " ", 2 >= 2~1 -> "*"
				i = 3, j = 4, 3 < 4   -> " ", 3 >= 3~1 -> "*"
				i = 4, j = 4, 4 < 4   -> " ", 4 >= 4~1 -> "*"
				*/
			}
			System.out.println();
		}
	}

}
