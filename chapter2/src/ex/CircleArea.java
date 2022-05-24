package ex;

public class CircleArea {

	public static void main(String[] args) {
		final double PI = 3.14;	// 원주율 상수로 선언
		double radius = 10.2;	//원의 반지름
		double circleArea = radius * radius * PI;	// 원의 면적 계산
		
		//원의 면적을 화면에 출력
		System.out.print("반지름 " + radius + ",");
		// ln이 빠지면 줄바꿈 없이 한줄로 출력됨
		System.out.println("원의 면적 = " + circleArea);
		
		System.out.printf("이름 : %s\n", "김자바");	
		// %s: 문자열 	\n: 줄바꿈
		System.out.printf("나이: %d ", 20);		
		// $d: 정수형 숫자
		/*
			printf("형식문자열", 값1, 값2, ...);
			d: 정수
			f: 실수
			s: 문자열
			
			정수 - %d			정수												123
				  %6d		6자리 정수, 왼쪽 빈 자리 공백							__123
				  %-6d		6자리 정수, 오른쪽 빈 자리 공백						123__
				  %06d		6자리 정수, 왼쪽 빈 자리 0채움						000123
			실수 - %10.2f		소수점 이상 7자리, 소수점 이하 2자리, 왼쪽 빈 자리 공백		__123.45
				  %-10.2f	소수점 이상 7자리, 소수점 이하 2자리, 오른쪽 빈 자리 공백	123.45__
				  %010.2f	소수점 이상 7자리, 소수점 이하 2자리, 왼쪽 빈 자리 0채움	000123.45
		   문자열 - %s		문자열											abc
		   		  %6s		6자리 문자열, 왼쪽 빈 자리 공백						__abc
		   		  %-6s		6자리 문자열, 오른쪽 빈 자리 공백						abc__
		  특수문자 - \t		탭(tab)
		   		   \n		줄 바꿈
		   		   %%		% 출력											%
		*/
		
			int value = 123;
			System.out.printf("상품의 가격:%d원\n", value);
			System.out.printf("상품의 가격:%6d원\n", value);
			System.out.printf("상품의 가격:%-6d원\n", value);
			System.out.printf("상품의 가격:%06d원", value);
	}

}
