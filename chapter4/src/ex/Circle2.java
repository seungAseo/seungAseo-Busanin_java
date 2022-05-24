package ex;

public class Circle2 {
	int radius;		// 원의 반지름 필드
	String name;	// 원의 이름 필드
	
	public Circle2() {	// 매개 변수 없는 생성자
		radius = 1;	// radius의 초기값은 1
		name = "";	// name의 초기값은 빈값
	}
	
	public Circle2(int r, String n) {	// 매개 변수를 가진 생성자
		radius = r;
		name = n;
	}
	
	public double getArea() {	// 멤버 메소드
		return radius * radius * 3.14;
	}
	
	public static void main(String[] args) {
		Circle2 pizza = new Circle2(10, "자바피자");
		double area = pizza.getArea();	// pizza의 면적 알아내기
		
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle2 donut = new Circle2();	// Circle 객체 생성, radius = 1
		donut.name = "자바도넛";			// donut의 이름을 자바도넛으로 설정
		area = donut.getArea();			// donut의 면적 알아내기
		
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
