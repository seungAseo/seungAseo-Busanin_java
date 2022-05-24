package exercise;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		String[] com = {"가위", "바위", "보"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			System.out.print("가위 바위 보!>>");
			String user = scanner.nextLine();
			
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			
			// 컴퓨터의 가위바위보 값을 랜덤하게 설정
			int n = (int)(Math.random()*3);	// 0, 1, 2 중에 랜덤 정수 리턴
			
			if(user.equals("가위")) {
				if(com[n].equals("가위")) {
					System.out.println("사용자 = 가위" + ", 컴퓨터 = " + com[n] +
							", 비겼습니다.");
				} else if(com[n].equals("바위")) {
					System.out.println("사용자 = 가위" + ", 컴퓨터 = " + com[n] +
							", 컴퓨터가 이겼습니다.");
				} else {	// 보
					System.out.println("사용자 = 가위" + ", 컴퓨터 = " + com[n] +
							", 사용자가 이겼습니다.");
				}
			} else if(user.equals("바위")) {
				if(com[n].equals("가위")) {
					System.out.println("사용자 = 바위" + ", 컴퓨터 = " + com[n] +
							", 사용자가 이겼습니다.");
				} else if(com[n].equals("바위")) {
					System.out.println("사용자 = 바위" + ", 컴퓨터 = " + com[n] +
							", 비겼습니다.");
				} else {	// 보
					System.out.println("사용자 = 바위" + ", 컴퓨터 = " + com[n] +
							", 컴퓨터가 이겼습니다.");
				}
			} else if(user.equals("보")) {
				if(com[n].equals("가위")) {
					System.out.println("사용자 = 보" + ", 컴퓨터 = " + com[n] +
							", 컴퓨터가 이겼습니다.");
				} else if(com[n].equals("바위")) {
					System.out.println("사용자 = 보" + ", 컴퓨터 = " + com[n] +
							", 사용자가 이겼습니다.");
				} else {	// 보
					System.out.println("사용자 = 보" + ", 컴퓨터 = " + com[n] +
							", 비겼습니다.");
				}
			} else { 
				System.out.println("다시 입력해주세요.");
			}
		}
		scanner.close();	
	}
}
