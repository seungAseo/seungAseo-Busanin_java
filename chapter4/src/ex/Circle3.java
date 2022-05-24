package ex;

public class Circle3 {
	int radius;
	
	public Circle3(int radius) {	// 생성자
		this.radius = radius;
	}

	void set(int radius) {			// 메서드
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle3 ob1 = new Circle3(1);
		Circle3 ob2 = new Circle3(2);
		Circle3 ob3 = new Circle3(3);
		
		ob1.set(4);
		ob2.set(5);
		ob3.set(6);
		
		System.out.println("ob1의 반지름 : " + ob1.radius);
		System.out.println("ob2의 반지름 : " + ob2.radius);
		System.out.println("ob3의 반지름 : " + ob3.radius);
	}

}
