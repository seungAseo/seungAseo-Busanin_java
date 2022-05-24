package practiceAnswer;

import java.util.Scanner;

public class Loop_3 {

	public static void main(String[] args) {
		/*
		3. while문과 Scanner를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을
   		제공하는 코드를 작성해보세요. 
		*/
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");

			int menuNum = scanner.nextInt();
			
			switch(menuNum) {
				case 1:
					System.out.print("예금액> ");
					balance += scanner.nextInt();
					break;
				case 2:
					System.out.print("출금액> ");
					balance -= scanner.nextInt();
					break;
				case 3:
					System.out.print("잔고> ");
					System.out.println(balance);
					break;
				case 4:
					run = false;
					break;
			}
			
		}			
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
