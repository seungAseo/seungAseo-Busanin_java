package example;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4_1_Rank {
	ArrayList<Student> studList = new ArrayList<Student>();
	Scanner scanner = new Scanner(System.in);
	
	// 학생 정보 입력
	private void read() {
		System.out.println("학생이름, 학과, 학번, 학점을 입력하세요.");
		for(int i = 0; i < 5; i++) {
			System.out.print(">> ");
			String name = scanner.next();
			String department = scanner.next();
			String id = scanner.next();
			double score = scanner.nextDouble();
			
			studList.add(new Student(name, department, id, score));
		}
		System.out.println("----------------------------------------");
	}
	
	// 학생의 등수를 계산
	private void setRank() {
		
	}
	
	
	// 학생 정보를 모두 출력
	private void printAll() {
		for(int i = 0; i < studList.size(); i++) {
			studList.get(i).showStudentInfo();
		}
	}
	
	// 학생 검색
	private void search() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.next();
			if(name.equals("그만")) {
				break;
			}
			int i; 
			for(i = 0; i < studList.size(); i++) {
				if(name.equals(studList.get(i).getName())) {
					studList.get(i).searchStudentInfo();
					break;
				}
			}
			// 입력된 이름의 학생을 찾을 수 없을 경우
			if(i >= studList.size()) {
				System.out.println("해당 학생은 찾을 수 없습니다.");
			}
		}
		scanner.close();
	}
	
	public void run() {
		read();			// 학생 정보 입력
		setRank();		// 학생 등수 계산
		printAll();		// 학생 정보를 모두 출력
		search();		// 학생 검색
	}
	
	public static void main(String[] args) {
		new Ex4_1_Rank().run();
	}

}
