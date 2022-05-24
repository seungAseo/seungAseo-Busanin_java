package exercise;

import java.util.Scanner;

public class GBB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] gbb = {"가위", "바위", "보"};
		int userChoice, computerChoice;
		
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
			userChoice = scanner.nextInt();
			if(userChoice == 4) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			
			computerChoice = (int)(Math.random()*3 + 1);	// 1~3 난수 생성
			if(userChoice < 1 || userChoice > 4) {
				System.out.println("숫자 1~4를 입력하세요.");
			} else {
				System.out.println("사용자 " + gbb[userChoice - 1] + " : 컴퓨터 " + gbb[computerChoice - 1]);
				
				int diff = userChoice - computerChoice;
				switch(diff) {
					case 0 :	// 서로 같은 것을 낸 경우
						System.out.println("비겼습니다.");
						break;           
					case -1 :	// 사용자가 가위(0), 컴퓨터가 바위(1) 또는 사용자가 바위(1), 컴퓨터가 보(2)를 낸 경우
					case 2 : 	// 사용자가 보(2), 컴퓨터가 가위(0)를 낸 경우
						System.out.println("사용자가 졌습니다.");
						break;
					case 1 :	// 사용자가 바위(1), 컴퓨터가 가위(0) 또는 사용자가 보(2), 컴퓨터가 바위(1)
					case -2 :	// 사용자가 가위(0), 컴퓨터가 보(2)
						System.out.println("사용자가 이겼습니다.");
						break;
				}
			}
		}
		scanner.close();
	}

}




