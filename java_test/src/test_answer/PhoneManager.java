package test_answer;

import java.util.Scanner;

class Phone {
	private String name, tel, address;
	
	public Phone(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public String getAddress() {
		return address;
	}
}

public class PhoneManager {
	Scanner scanner = new Scanner(System.in);
	private Phone[] p;
	
	// 인원수, 이름, 전화번호, 주소 입력 메소드
	public void input() {
		System.out.print("인원수>>");
		int count = scanner.nextInt();
		
		p = new Phone[count];
		for(int i = 0; i < p.length; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소 >>");			
			p[i] = new Phone(scanner.next(), scanner.next(), scanner.next());
		}
		System.out.println("저장되었습니다...");
	}
	
	// 이름값으로 전화번호, 주소를 반환해주는 메소드
	public String search(String name) {
		for(int i = 0; i < p.length; i++) {
			if(p[i].getName().equals(name)) {
				return p[i].getTel() + ", " + p[i].getAddress();
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
			String str = search(name);
			if(str == null) {
				System.out.println(name + " 이 없습니다.");
			} else {
				System.out.println(name + "의 번호와 주소는 " + str + " 입니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		new PhoneManager().run();
	}
}






