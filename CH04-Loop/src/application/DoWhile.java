package application;

public class DoWhile {

	public static void main(String[] args) {
		// DoWhile은 처음 한번은 조건과 상관없이 실행됨
		int count = 100;
		
		System.out.println("do while 반복문");
		
		do {
			System.out.println("카운트 : " + count);
		} while (count++ < 5);
		
	}

}
