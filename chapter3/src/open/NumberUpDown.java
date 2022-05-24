package open;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberUpDown {

	public static void main(String[] args) {
		int low, high;	// 숨은 번호의 범위
		int hiddenNum; 	// 숨은 번호
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			// 숨은 번호 맞추기 작성
			int i = 1;	// 사용자의 시행 횟수
			low = 0;	// 최소 범위
			high = 99;	// 최대 범위
			hiddenNum = r.nextInt(100);	// 0~99사이의 정수 난수(숨은 번호) 생성
			System.out.println("Up & Down게임입니다. 숨겨진 수를 맞추어 보세요.");
			
			while(true) {
				System.out.println(low + "-" + high);
				System.out.print(i + ">>");
				int num = 0;
				
				// 예외 처리(InputMismatchException)
				try {
					num = scanner.nextInt();	// 수를 입력 받음
				} catch(InputMismatchException e) {
					System.out.println("정수만 입력해야 됩니다.");
					scanner.nextLine();
					continue;
				}
				
				// 숨은 번호와 입력값 비교 처리
				if(num > high || num < low) {
					System.out.println("범위를 벗어났습니다.");
				} else {	// low <= num <= high
					if(num == hiddenNum) {
						System.out.println("맞았습니다.");
						break;
					}else if(num > hiddenNum) {
						System.out.println("더 낮게");
						high = num;
					}else {		// num < hiddenNum
						System.out.println("더 높게");
						low = num;
					}
				}
				i++;
			}
			
			System.out.print("다시하시겠습니까?(y/n)>>");
			if(scanner.next().equals("n")) {
				break;
			}
		}
		scanner.close();
	}

}
