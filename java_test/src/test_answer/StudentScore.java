package test_answer;

public class StudentScore {

	public static void main(String[] args) {
		int[][] scores = {
				{80, 60, 70},
				{90, 95, 80},
				{75, 80, 100},
				{80, 70, 95},
				{100, 65, 80}
		};
		
		System.out.println("학생번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=============================================");
		
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			System.out.print((i+1) + "번 학생: ");
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
				sum += scores[i][j];
			}
			System.out.println(sum + "\t" + (double)(sum / scores[i].length));
		}
	}
}
