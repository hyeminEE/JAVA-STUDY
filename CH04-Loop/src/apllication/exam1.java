package apllication;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {

  
		System.out.println("�޴�");
		System.out.println("====");
		System.out.println();
		System.out.println("1. ����Ʈ '��ο�'");
		System.out.println("2. ����Ʈ '�ȳ�?'");
		System.out.println("3. ���α׷� ����");
		System.out.println();
		System.out.print("�ɼ��� ���� > ");

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		
		if (input == 1) {
	        System.out.println("��ο�");
	    } else if (input ==2) {
	    	System.out.println("�ȳ�?");
	    } else if (input ==3) {
	    	System.out.println("�����մϴ�...");
	    } else if (input == 10000) {
	    	System.out.println("�̽��Ϳ��׸� �߰��߽��ϴ�.");
	    } else {
	    	System.out.println("�߸��� �ɼ��Դϴ�.");
	    }
	}

}
