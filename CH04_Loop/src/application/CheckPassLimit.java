package application;

import java.util.Scanner;

public class CheckPassLimit {

   public static void main(String[] args) {
      // �н����尡 Ʋ������ 3�� �Է��� �� �ִ� ��ȸ�� �ش�.
      // �н����尡 ������ '���ӽ���' ����ϰ� �ݺ����� ��������
      // �н����尡 3ȸ Ʋ���� '���Ӱź�'
      final String USER_PASSWORD = "hello";
      
      Scanner scanner = new Scanner(System.in);
      
      boolean accessOK = false; // �÷��� (flag): �Ҹ������� ���¿� ���� ó���帧 ����
      
       // ���⿡ �ڵ� �ۼ� ����� ������ accessOK = true; �� �ϰ� "���ӽ���"�� ���
      for(int i=0; i<3 ; i++) {
    	  System.out.print("�н����� �Է� > ");
    	  String password = scanner.nextLine();
    	  
    	  if(password.equals(USER_PASSWORD)) {
    		  System.out.println("���ӽ���");
    		  accessOK = true;
    		  break;
    	  } else {
    		  System.out.printf("����� %d �� Ʋ�Ƚ��ϴ�. \n", i+1);
    	  }
      }
      scanner.close();
      
      if(!accessOK) {
         System.out.println("���Ӱź�");
      }

   }

}