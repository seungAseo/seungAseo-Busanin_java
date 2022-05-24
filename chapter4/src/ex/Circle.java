package ex;

public class Circle {
	int radius;		// 원의 반지름 필드
	String name;	// 원의 이름 필드
	
	public double getArea() {	// 멤버 메소드
		return radius * radius * 3.14;
	}
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();			// Circle 객체 생성
		pizza.radius = 10;				// pizza의 반지름을 10으로 설정
		pizza.name = "자바피자";			// pizza의 이름을 자바피자로 설정
		double area = pizza.getArea();	// pizza의 면적 알아내기
		
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();	// Circle 객체 생성
		donut.radius = 2;				// donut의 반지름을 2로 설정
		donut.name = "자바도넛";			// donut의 이름을 자바도넛으로 설정
		area = donut.getArea();			// donut의 면적 알아내기
		
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
