package exercise;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Add {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(str, "+");
		
		int sum = 0;
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			s = s.trim();
			sum += Integer.parseInt(s);
		}
		System.out.println("합은 " + sum);
		scanner.close();
	}

}
