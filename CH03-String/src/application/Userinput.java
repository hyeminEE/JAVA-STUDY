package application;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// 입력을 받는 클래스 
		Scanner scanner = new Scanner(System.in); // 스캐너 객체를 선언
		
		System.out.print("온도를 입력해 주세요 : ");
		
		double c = scanner.nextDouble(); //스캐너로 정수 입력을 받아 x에 입력, 실행시 입력을 대기하고 엔터키가 입력되면 종료
		double f = (c * 9/5) + 32; // 화씨 변수 f는 공식대로
		
		System.out.printf("섭씨 %.1f는 화씨 %.1f이다.", c , f);
	

	}

}
