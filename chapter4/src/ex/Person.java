package ex;

public class Person {
	String name;
	String job;
	int age;

	
	// 범위지시어 리턴타입 함수명()
	public void showName() {
		System.out.println(name);
	}
	public void run() {
		System.out.println(name + " 달린다");
	}
	public void walk(int num) {  // num 매개변수, parameter
		System.out.println(name + num + "km 걷는다");
	}
	
	public static void main(String[] args) {
		Person sa = new Person();
		sa.name = "서승아 ";
		sa.showName();
		sa.run();
		sa.walk(5); // 5는 인자, argument
		
		// sa.run() : 서승아 달린다
		// sa.walk(5) : 서승아 5km 걷는다
	}
}

