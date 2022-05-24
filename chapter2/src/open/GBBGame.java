package open;

import java.util.Scanner;

public class GBBGame {
		/*
		 가위바위보 게임
		 목적- 기본 자바 프로그램 작성 연습, Scanner 이용한 입출력 연습, if-else문 연습
		 
		 두 사람이 하는 가위바위보 게임을 만들어보자. 두 사람의 이름은 '철수'와 '영희'이다.
		 먼저 "철수"를 출력하고 "가위", "바위", "보" 중 하나를 문자열로 입력받는다.
		 "영희에 대해서 마찬가지 방법으로 입력받는다.
		 두 사람으로부터 문자열을 입력받은 후 누가 이겼는지 판별하여 승자를 출력한다.(난이도 중)
		
		 출력
		 가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.
		 철수 >> 가위 <- 여기서 가위는 입력하는 값
		 영희 >> 보 	<- 여기서 보는 입력하는 값
		 철수가 이겼습니다.
		 
		 힌트
		 System.out.print()를 사용하면 화면 출력 이후 커서를 다음줄로 옮기지 않는다.
		 문자열을 읽기 위해서는 Scanner 클래스의 next()메소드를 이용하면 된다.
		 자바에서 문자열 비교는 주의를 기울여야 한다. String var;로 선언한 var와 "가위"를 비교
		 하기 위해서는 if(var --"가위")로 해서는 안되고, if(var.equals("가위"))로 비교하여야 한다.
		 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.println("철수 >> ");
		String chulsu = scanner.next();
		
		System.out.println("영희 >> ");
		String younghee = scanner.next();
		
		if(chulsu.equals("가위")) {	// 철수가 가위인 경우
			if(younghee.equals("가위")) {
				System.out.println("비겼습니다.");	
			} else if(younghee.equals("바위")) {
				System.out.println("철수가 졌습니다.");
			} else if(younghee.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}
		} else if(chulsu.equals("바위")) {
			if(younghee.equals("가위")) {
				System.out.println("철수가 이겼습니다.");	
			} else if(younghee.equals("바위")) {
				System.out.println("비겼습니다.");
			} else if(younghee.equals("보")) {
				System.out.println("철수가 졌습니다.");
				}
		} else if(chulsu.equals("보")) {
			if(younghee.equals("가위")) {
				System.out.println("철수가 졌습니다.");	
			} else if(younghee.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			} else if(younghee.equals("보")) {
				System.out.println("비겼습니다.");
			}
		}
		scanner.close();
	}
}

