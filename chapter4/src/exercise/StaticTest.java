package exercise;

class Circle {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
}

class CircleManager {	// static 메소드만 가짐
	static void copy(Circle src, Circle dest) {	// src를 dest에 복사
		dest.setRadius(src.getRadius());	// src의 반지름을 dest에 복사
	}
	static boolean equals(Circle a, Circle b) {	// a와 b의 반지름이 같으면 true 리턴
		if(a.getRadius() == b.getRadius()) {
			return true;
		} else {
			return false;
		}
	}
}

public class StaticTest {

	public static void main(String[] args) {
		Circle pizza = new Circle(5);	// 반지름이 5인 원 생성
		Circle waffle = new Circle(1);	// 반지름이 1인 원 생성
		
		boolean res = CircleManager.equals(pizza, waffle);	// pizza와 waffle 비교
		if(res == true) {
			System.out.println("pizza와 waffle 크기 같음");
		}else {
			System.out.println("pizza와 waffle 크기 다름");
		}
		
		CircleManager.copy(pizza, waffle);	// pizza를 waffle에 복사
		res = CircleManager.equals(pizza, waffle);	// pizza와 waffle 비교
		if(res == true) {
			System.out.println("pizza와 waffle 크기 같음");
		}else {
			System.out.println("pizza와 waffle 크기 다름");
		}
	}

}
