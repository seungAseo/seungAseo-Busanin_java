package exercise;

import java.util.Scanner;

class Phone2 {
	private String name, tel;
	
	public Phone2(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
}

public class PhoneManager {
	Scanner scanner = new Scanner(System.in);
	private Phone2[] p;
	
	// 인원수, 이름, 전화번호 입력 메소드
	public void input() {
		System.out.print("인원수>>");
		int count = scanner.nextInt();
		
		p = new Phone2[count];
		for(int i = 0; i < p.length; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");			
			p[i] = new Phone2
					(scanner.next(), scanner.next());
		}
		System.out.println("저장되었습니다...");
	}
	
	// 이름값으로 전화번호를 반환해주는 메소드
	public String search(String name) {
		for(int i = 0; i < p.length; i++) {
			if(p[i].getName().equals(name)) {
				return p[i].getTel();
			}
		}
		return null;
	}
	
	// 검색을 진행할 메서드
	public void run() {
		input();
		while(true) {
			System.out.print("검색할 이름>>");
			String name = scanner.next();
			if(name.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			String tel = search(name);
			if(tel == null) {
				System.out.println(name + " 이 없습니다.");
			} else {
				System.out.println(name + "의 번호는 " + tel + " 입니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		new PhoneManager().run();
	}
}






