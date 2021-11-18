package integerVariable;

public class App {

	public static void main(String[] args) {
		// 변수 만들기 : 1. 변수선언(타입, 자료형), 2. 변수 초기화
		int x = 10;
		int y = 30;
		
		int z = x + y;
 
		int a; // 변수 a를 선언 (타입필요)
		int b = 10; // 변수 b는 선언과 초기화 동시에
		a = 7; // a에 초기값 입력
		
		System.out.println("변수 z의 값은:" + z);
		// ㄴ 괄호 안에 z를 적어줘야 실행됨
		System.out.println("변수 a의 값은:" + a);
		System.out.println("변수 b의 값은:" + b);
		// 변수는 값을 다시 재할당(바꿀 수 있다)
		
		z = a+b;
		System.out.println("변수 z의 값은:" + z);
	}

}

 