package exercise;

import java.util.Scanner;

class Player2 {
	Scanner scanner;
	private String name;	// 참가자 이름
	private String word;	// 참가자가 입력한 단어
	
	public Player2(String name) {
		this.name = name;
		scanner = new Scanner(System.in);
	}
	
	public String getName() {
		return name;
	}
	
	// 사용자로부터 단어를 입력받는 메소드
	public String getWordFromUser() {
		System.out.print(name + ">>");
		word = scanner.next();
		return word;
	}
	
	// 끝말잇기를 계속하는지를 판별하는 메소드
	public boolean checkSuccess(String lastWord) {
		int lastIndex = lastWord.length() - 1;
		char lastChar = lastWord.charAt(lastIndex);
		char firstChar = word.charAt(0);
		
		if(lastChar == firstChar) {
			return true;
		} else {
			return false;
		}
	}
}

public class WordGameApp {	
	private String word = "아버지"; 	// 시작 단어
	private Player2[] p;			// 게임 참가자들
	
	// 게임을 진행하는 메소드
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int count = scanner.nextInt();	// 참가 인원
		p = new Player2[count];
		
		// 참여자의 이름을 입력받아 Player2 객체 생성
		for(int i = 0; i < p.length; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String name = scanner.next();
			p[i] = new Player2(name);
		}
		
		String lastWord = word;		// word에서부터 시작
		System.out.println("시작하는 단어는 " + word + "입니다");
		int index = 0;	// 참가자들의 순서를 나타내는 index
		
		// 끝말잇기 게임 진행
		while(true) {
			String inputWord = p[index].getWordFromUser();	// 참가자가 입력한 단어
			if(!p[index].checkSuccess(lastWord)) {	// 끝말잇기가 제대로 진행되었는지 check
				System.out.print(p[index].getName() + "이 졌습니다.");
				break;
			}
			index++;	// 다음 참가자
			index %= p.length;	// index가 참가자의 개수보다 증가하는 것을 막음
			// index = 0 ~ 2 3 -> 0 ~ 2 3 -> 0 ~ 2 3
			lastWord = inputWord;
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		WordGameApp wGame = new WordGameApp();
		wGame.run();
	}
}
