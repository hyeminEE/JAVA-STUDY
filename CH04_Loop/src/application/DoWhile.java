package application;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// do while�� ó�� �ѹ��� ���ǰ� ������� �����
		/*
		int count = 100;
		
		System.out.println("do while �ݺ���");
		
		do {
			System.out.println("ī��Ʈ : "+count);
		} while(count++ < 5);
		*/
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		String password = ""; //���ڿ� ����� �ʱⰪ�� ����(null)
		
		do {
			System.out.print("����� �Է� > ");
			password = scanner.nextLine(); 
				
		} while(!password.equals(USER_PASSWORD)); // !true �� false �̰� !false �� true �̴�.
		
		scanner.close();
		
		System.out.println("���� ����.");
	}

}