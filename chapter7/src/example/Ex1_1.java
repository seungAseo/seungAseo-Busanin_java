package example;

import java.util.Vector;

public class Ex1_1 {

	public static void main(String[] args) {
		Vector<Character> v = new Vector<Character>();
		v.add('A');
		v.add('B');
		v.add('C');
		v.add('D');
		v.add('F');
		
		for(int i = 0; i < v.size(); i++) {
			switch(v.get(i)) {
				case 'A' :
					System.out.println(4.0);
					break;
				case 'B' :
					System.out.println(3.0);
					break;
				case 'C' :
					System.out.println(2.0);
					break;
				case 'D' :
					System.out.println(1.0);
					break;
				case 'F' :
					System.out.println(0.0);
					break;
			}
		}
	}

}








