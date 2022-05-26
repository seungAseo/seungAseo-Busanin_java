package exercise;

import java.util.ArrayList;
import java.util.Scanner;

class Location {
	private int x, y;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(Location loc) {
		double dis = (x - loc.x)*(x - loc.x) + (y - loc.y)*(y - loc.y);
		return Math.sqrt(dis);	// sqrt - 제곱근
	}
}

public class TravelManager {

	public static void main(String[] args) {
		ArrayList<Location> travelList = new ArrayList<Location>();
		Scanner scanner = new Scanner(System.in);
		
		travelList.add(new Location(0, 0));		// 시작 위치
		System.out.println("쥐가 이동한 위치(x,y)를 5개 입력하라.");
		for(int i = 0; i < 5; i++) {
			System.out.print(">> ");
			travelList.add(new Location(scanner.nextInt(), scanner.nextInt()));
		}
		travelList.add(new Location(0, 0));		// 최종 위치
		
		double sum = 0.0;
		for(int i = 0; i < travelList.size() - 1; i++) {
			// Location(i)와 Location(i+1) 사이의 이동거리
			double dis = travelList.get(i).distance(travelList.get(i+1));
			sum += dis;
		}
		System.out.println("총 이동 거리는 " + sum);
		scanner.close();
	}

}
