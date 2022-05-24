package exercise;

public class Ex7 {

	public static void main(String[] args) {
		for(int i = 1; i < 100; i++) {
			int count = 0;	// 3의 배수 세기 위한 변수
			
			int first = i / 10;		// 10의 자리 수
			int second = i % 10;	// 1의 자리 수
			
			if((first != 0) && (first % 3 == 0)) {
				count++;	// 3의 배수
			}
			if((second != 0) && (second % 3 == 0)) {
				count++;	// 3의 배수
			}
			
			switch(count) {
			case 1:
				System.out.println(i + "박수한번");
				break;
			case 2:
				System.out.println(i + "박수두번");
				break;
			}
		}
	}

}
