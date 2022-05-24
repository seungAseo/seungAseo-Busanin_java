package example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex4_2 {
	HashMap<String, Student> studMap = new HashMap<String, Student>();
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
			
			studMap.put(name, new Student(name, department, id, score));
		}
		System.out.println("----------------------------------------");
	}
	
	// 학생 정보를 모두 출력
	private void printAll() {
		Set<String> keys = studMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Student student = studMap.get(key);
			student.showStudentInfo();
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
			Student student = studMap.get(name);
			if(student != null) {
				student.searchStudentInfo();
			} else {
				System.out.println("해당 학생은 찾을 수 없습니다.");
			}			
		}
		scanner.close();
	}
	
	public void run() {
		read();			// 학생 정보 입력
		printAll();		// 학생 정보를 모두 출력
		search();		// 학생 검색
	}
	
	public static void main(String[] args) {
		new Ex4_2().run();
	}

}
