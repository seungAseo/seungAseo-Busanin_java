package test;

class Point {
	private int x, y;
	public Point() {
		this.x = this.y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}

class ColorP extends Point {
	private String color;
	public ColorP(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPoint {
	public static void main(String[] args) {
		ColorP cp = new ColorP(10, 20, "GREEN색으로 ");
		cp.showColorPoint();
	}
}
