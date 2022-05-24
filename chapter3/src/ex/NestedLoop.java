package ex;

public class NestedLoop {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {  // 1단 ~ 9단, 단에 대한 반복.
			for(int j = 1; j < 10; j++) {  // 각 단에 곱셈
				System.out.print(i + "x" + j + "=" + i*j); // 구구단 출력
				System.out.print("\t");
			}
			System.out.println();	// 한 단이 끝나면 다음 줄로 커서 이동
		}
		/*
		 i -> 1~9 반복
		 j -> 1~9 반복
		 */
	}

}
