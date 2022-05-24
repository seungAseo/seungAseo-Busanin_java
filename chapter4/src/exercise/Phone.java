package exercise;

import java.util.Scanner;

public class Phone {
	private String name, tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름과 전화번호 입력 >>");		
		Phone p1 = new Phone(scanner.next(), scanner.next());
		System.out.print("이름과 전화번호 입력 >>");
		Phone p2 = new Phone(scanner.next(), scanner.next());
		System.out.println(p1.getName() + "의 번호 " + p1.getTel());
		System.out.println(p2.getName() + "의 번호 " + p2.getTel());
		scanner.close();
	}

}
