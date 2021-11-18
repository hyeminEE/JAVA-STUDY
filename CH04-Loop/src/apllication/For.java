package apllication;

public class For {

	public static void main(String[] args) {
		// for 반복문 for(초기값;조건;증감){명령문;}
		// for(int i=0; i<=10; i++) {
			// i는 0이 초기값, i가 10보다 작은 동안에는(조건이 참일시) {} 대괄호안을 출력하고 계속 증감
			// System.out.println("i: " + i);}
		
		
		// for(;;) {무한반복
		// System.out.println("헬로우!");}
		
		int total = 0;
		for(int i=0; i<=100; i++) {
			total += i;		
		}
		System.out.println(total);
	}

}
