package application;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// �Է��� �޴� Ŭ���� 
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü�� ����
		
		System.out.print("�µ��� �Է��� �ּ��� : ");
		
		double c = scanner.nextDouble(); //��ĳ�ʷ� ���� �Է��� �޾� x�� �Է�, ����� �Է��� ����ϰ� ����Ű�� �ԷµǸ� ����
		double f = (c * 9/5) + 32; // ȭ�� ���� f�� ���Ĵ��
		
		System.out.printf("���� %.1f�� ȭ�� %.1f�̴�.", c , f);
	

	}

}
