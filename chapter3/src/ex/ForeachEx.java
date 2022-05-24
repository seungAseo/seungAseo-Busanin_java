package ex;

public class ForeachEx {

	public static void main(String[] args) {
		int[] n = {1, 2, 3, 4, 5};	// 크기가 5인 정수형 배열
		int sum = 0;
		int count = 1;
		
		for(int k : n) {
			if(count == n.length) {
			System.out.println(k);
			} else {
				System.out.print(k + " "); // 반복되는 k값 출력
			}
			sum += k;
			count++;
		}
		// 방식1(숫자 다음에 줄바꿈 하는법↑)
		/* for(int k : n) {
			if(k == n[n.length - 1]) {
				System.out.println(k);
			} else {
				System.out.print(k + " "); // 반복되는 k값 출력
			}
			sum += k;
		}
		*/
		// 방식1(숫자 다음에 줄바꿈 하는법↑)
		System.out.println("합은 " + sum);
		
		String[] f = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		for(String s : f) {
			System.out.print(s + " ");
		}
	}

}
