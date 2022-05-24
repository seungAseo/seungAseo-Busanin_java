package exercise;

import java.util.Scanner;

interface StackInterface {
	int length(); 				// 스택에 들어 있는 문자열 개수 리턴
	String pop();				// 스택의 톱에 들어 있는 문자열 팝
	boolean push(String ob);	// 스택의 톱에 문자열 ob 푸시 삽입
}

class StringStack implements StackInterface {
	private String[] element;
	private int index;
	
	public StringStack(int size) {
		element = new String[size];
		index = 0;		// 배열의 인덱스 0으로 초기화
	}
	
	@Override
	public int length() {
		return index;
	}

	@Override
	public String pop() {
		if(index == 0) {	// 스택이 비었음
			return null;
		}
		index--;			//  스택 포인터 감소
		return element[index];
	}

	@Override
	public boolean push(String ob) {
		if(index == element.length) {	// 스택이 다 찼음
			return false;
		}
		element[index++] = ob;			// 스택에 저장 후 스택 포인터 증가
		return true;
	}
}

public class StackManager {

	public static void main(String[] args) {
		StringStack s = new StringStack(10);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(">>");
		for(int i = 0; i < 5; i++) {
			s.push(scanner.next());
		}
		
		int count = s.length();
		for(int i = 0; i < count; i++) {
			System.out.print(s.pop() + " ");
		}
		scanner.close();
	}
}







