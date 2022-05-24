package exercise;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String str = scanner.nextLine();
			if(str.equals("exit")) {
				System.out.println("종료합니다...");
				break;	
			}
			StringTokenizer st = new StringTokenizer(str, " ");
			System.out.println("어절 개수는 " + st.countTokens());
		}
		scanner.close();
	}
}
