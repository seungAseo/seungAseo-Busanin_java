// 숫자를 입력받아서 입력한 숫자의 구구단을 출력하시오
// 3 x 1 = 3
// 3 x 2 = 6
// ..
// 3 x 9 = 27

package repeat;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		System.out.println("구구단을 나타낼 숫자를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		for(int i=0; i < 10; i++) {
		System.out.println(input + " x " + i + " = " + (input * i));
		}
	}

}
