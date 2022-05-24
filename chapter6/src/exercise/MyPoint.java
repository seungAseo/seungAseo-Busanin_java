package exercise;
/*
 앞에 exercise.을 제거해줄려면
 이 파일을 디폴트 패키지에다가 넣어주고
 package exercise; 코드를 삭제해준다.
*/

public class MyPoint {
	int x, y;
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	public String toString() {
		return getClass().getName() + "(" + x + "," + y + ")";
	}
	public static void main(String[] args) {
		MyPoint a = new MyPoint(3, 20);
		System.out.println(a); // a는 자동으로 a.toString()으로 변환됨

	}

}
