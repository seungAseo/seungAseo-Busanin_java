package test;

import java.util.Scanner;


class Phone3 {
private String name, tel, add;
	
	public Phone3(String name, String tel, String add) {
		this.name = name;
		this.tel = tel;
		this.add = add;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	public String getAdd() {
		return add;
	}
}

public class PhonePhoneManager {
	Scanner scanner = new Scanner(System.in);
	private Phone3[] P;
	
	
	public void input() {
		System.out.print("인원수>>");
		int count = scanner.nextInt();
		
		P = new Phone3[count];
		for(int i = 0; i < P.length; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소>>");			
			P[i] = new Phone3
					(scanner.next(), scanner.next(), scanner.next());
		}
		System.out.println("저장되었습니다...");
	}
	
	
	public String search(String name) {
		for(int i = 0; i < P.length; i++) {
			if(P[i].getName().equals(name)) {
				return P[i].getTel();  
			} 
		}
		return null;
	}
	
	 public String search2(String name) {
         for(int i = 0; i < P.length; i++) {
            if(P[i].getName().equals(name)) {
               return P[i].getAdd();  
            }
         }
         return null;
      }

	
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
				System.out.println(name + " 은 없습니다.");
			} else {
				String add = search2(name);
	         if(add == null) {
		            System.out.println(name + " 은(는) 없습니다.");
		         } else 
				System.out.println(name + "의 번호와 주소는 " + tel + " " + add + " 입니다.");
			
	         }
		}
	}
	
	public static void main(String[] args) {
		new PhonePhoneManager().run();
	}
}
