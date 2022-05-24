package practiceAnswer;

import java.util.Scanner;

public class If_5 {

	public static void main(String[] args) {
		/*
		5. 점수를 Scanner로 입력받아서 학점을 출력하세요.
		   A - 94점 이상(94~97)
		   A+ - 98점 이상(98~100)
		   A- - 94점 미만(90~93)
		   B - 80점 이상
		   C - 70점 이상
		   D - 60점 이상
		   F - 60점 미만
		점수를 입력하세요>>> 98
		학점 : A+
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요>>> ");
		int score = scanner.nextInt();
		String grade = "";
		
		/*
		if(score <= 100 && score >= 98) {
			grade = "A+";
		} else if(score >= 94) {
			grade = "A";
		} else if(score >= 90) {
			grade = "A-";
		} else if(score >= 80) {
			grade = "B";
		} else if(score >= 70) {
			grade = "C";
		} else if(score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		*/
		if(score <= 100 && score >= 90) {
			if(score >= 98) {
				grade = "A+";
			} else if(score >= 94) {
				grade = "A";
			} else { // score <= 93 && score >= 90
				grade = "A-";
			}
		} else if(score >= 80) {
			grade = "B";
		} else if(score >= 70) {
			grade = "C";
		} else if(score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("학점 : " + grade);
	}

}
