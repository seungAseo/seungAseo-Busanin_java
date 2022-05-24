package exercise;

public class Gambling {

	public static void main(String[] args) {
		int[] numbers = new int[3];
		
		while(true) {
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = (int)(Math.random()*3 + 1);	// 1~3까지 난수 생성
				System.out.print(numbers[i] + "\t");
			}
			System.out.println();
			
			if(numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
				System.out.println("성공");
				break;
			}
		}
	}

}
