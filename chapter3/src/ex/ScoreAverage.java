package ex;

public class ScoreAverage {

	public static void main(String[] args) {
		double[][] score = { {3.3, 3.4},	// 1학년 1, 2학기 평점
							 {3.5, 3.6},	// 2학년 1, 2학기 평점
							 {3.7, 4.0},	// 3학년 1, 2학기 평점
							 {4.1, 4.2} };		// 4학년 1, 2학기 평점
		double sum = 0;
		
		for(int year = 0; year < score.length; year++) {	// 각 학년별로 반복
			for(int term = 0; term < score[year].length; term++) {	// 학기별로 반복
				sum += score[year][term];
			}
		
		// 다른 방법 ↓
		/*
		for(int year = 1; year <= score.length; year++) { // 각 학년별로 반복
			for(int term = 1; term <= score[year-1].length; term++) { // 학기별로 반복
				sum += score[year-1][term-1];
			}
		*/
		}
		// 첫번째 for문 year = 0~3
		// 두번째 for문 term = 0~1
		// 1학년 year = 0 / 1~2학기 term = 0~1
		// 2학년 year = 1 / 1~2학기 term = 0~1
		// 3학년 year = 2 / 1~2학기 term = 0~1
		// 4학년 year = 3 / 1~2학기 term = 0~1
		
		int n = score.length;		// 배열의 행 개수 : 4
		int m = score[0].length;	// 배열의 열 개수 : 2
		
		System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
	}

}
