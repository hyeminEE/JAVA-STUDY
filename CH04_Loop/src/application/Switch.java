package application;

public class Switch {

   public static void main(String[] args) {
      // Switch��
      int option = 0;
      
      switch(option) {
      case 0: // Switch���� �ɼǺ����� case 0�� ������
         System.out.println("�ɼ� 0 ����");
         System.out.println("���̽� 0 �϶�");
         break; // �׻� switch������ ���̽� �ϳ� ���� break�ۼ�
      case 1: // Switch���� �ɼǺ����� case 1�� ������
         System.out.println("�ɼ� 1 ����");
         break; // �׻� switch������ ���̽� �ϳ� ���� break�ۼ�
      case 100: // Switch���� �ɼǺ����� case 10�� ������
         System.out.println("���α׷� ����...");
         break; // �׻� switch������ ���̽� �ϳ� ���� break�ۼ�
      default: // else�� ����, ���� ���̽��� �´� ���� ������ ����
         System.out.println("�߸��� �ɼǹ�ȣ");
         break;
      }

   }

}