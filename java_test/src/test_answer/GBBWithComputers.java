package test_answer;

import java.util.Scanner;

public class GBBWithComputers {

	public static void main(String[] args) {
		String[] com = {"가위", "바위", "보"};
		Scanner scanner = new Scanner(System.in);
		
		int count = 1;	// 몇번째인지 나타내기 위한 변수
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			System.out.print((count++) + ": 가위 바위 보!>>");
			
			String user = scanner.nextLine();
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			
			// 컴퓨터의 가위바위보 값을 랜덤하게 설정
			int n1 = (int)(Math.random()*3);		// 0, 1, 2, 중에 랜덤 정수 리턴
			int n2 = (int)(Math.random()*3);
			String computer1 = com[n1];
			String computer2 = com[n2];
			
			System.out.println("사용자 = " + user + ", 컴퓨터1 = " + computer1 + ", 컴퓨터2 = " + computer2);
			
			if(user.equals("가위")) {
				if(computer1.equals("가위")) {
					if(computer2.equals("가위")) {
						System.out.println("비겼습니다.");
					} else if(computer2.equals("바위")) {
						System.out.println("컴퓨터2가 이겼습니다.");
					} else {	// 보
						System.out.println("컴퓨터2가 졌습니다.");
					}
				} else if(computer1.equals("바위")) {
					if(computer2.equals("가위")) {
						System.out.println("컴퓨터1이 이겼습니다.");						
					}
					else if(computer2.equals("바위")) {
						System.out.println("사용자가 졌습니다.");
					}
					else {
						System.out.println("다시 하세요.");				
					}
				} else {	// 보
					if(computer2.equals("가위")) {
						System.out.println("컴퓨터1이 졌습니다.");
					}
					else if(computer2.equals("바위")) {
						System.out.println("다시 하세요.");
					}
					else {
						System.out.println("사용자가 이겼습니다.");				
					}
				}
			} else if(user.equals("바위")) { // 사용자가 바위인 경우
				if(computer1.equals("가위")) {	// 컴퓨터1이 가위인 경우
					if(computer2.equals("가위")) {
						System.out.println("사용자가 이겼습니다.");
					}
					else if(computer2.equals("바위")) {
						System.out.println("컴퓨터1이 졌습니다.");
					}
					else {
						System.out.println("다시 하세요.");		
					}
				}
				else if(computer1.equals("바위")) {	// 컴퓨터1이 바위인 경우
					if(computer2.equals("가위")) {
						System.out.println("컴퓨터2가 졌습니다.");
					}
					else if(computer2.equals("바위")) {
						System.out.println("비겼습니다.");
					}
					else {
						System.out.println("컴퓨터2가 이겼습니다.");		
					}
				}
				else {	// 컴퓨터1이 보인 경우
					if(computer2.equals("가위")) {
						System.out.println("다시 하세요.");
					}
					else if(computer2.equals("바위")) {
						System.out.println("컴퓨터1이 이겼습니다.");
					}
					else {
						System.out.println("사용자가 졌습니다.");		
					}							
				}
				System.out.println();
			}
			else if(user.equals("보")) { // 사용자가 보인 경우
				if(computer1.equals("가위")) {	// 컴퓨터1이 가위인 경우
					if(computer2.equals("가위")) {
						System.out.println("사용자가 이겼습니다.");
					}
					else if(computer2.equals("바위")) {
						System.out.println("다시 하세요.");
					}
					else {
						System.out.println("컴퓨터1이 졌습니다.");		
					}
				}
				else if(computer1.equals("바위")) {	// 컴퓨터1이 바위인 경우
					if(computer2.equals("가위")) {
						System.out.println("다시 하세요.");
					}
					else if(computer2.equals("바위")) {
						System.out.println("사용자가 졌습니다.");
					}
					else {
						System.out.println("컴퓨터1이 졌습니다.");		
					}
				}
				else {	// 컴퓨터1이 보인 경우
					if(computer2.equals("가위")) {
						System.out.println("컴퓨터2가 이겼습니다.");
					}
					else if(computer2.equals("바위")) {
						System.out.println("컴퓨터2가 졌습니다.");
					}
					else {
						System.out.println("비겼습니다.");		
					}										
				}
				System.out.println();	// 한 줄 띄움
			} else {
				System.out.println("다시 입력해주세요.");
				count--;
			}
		}
		scanner.close();
	}
}













