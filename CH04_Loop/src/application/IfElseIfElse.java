package application;

import java.util.Scanner;

public class IfElseIfElse {

   public static void main(String[] args) {
      // ��ĳ��
            Scanner scanner = new Scanner(System.in);
                  
            System.out.println("����� ������?");
            int apple = scanner.nextInt();
            System.out.println("�ٳ����� ������?");
            int banana = scanner.nextInt();
            scanner.close(); //��ĳ�� ����(���̻� �Ⱦ���)
                  
            if(apple > banana) {
               System.out.println("����� �ٳ������� ����");
            }
            //  �� ������ �ƴҶ� else if�� ����, else if�� �ƴҰ�� else�� ����
            
            else if(apple < banana) { // �� �ٸ� ������ else if(����)�� ����Ѵ�.
               System.out.println("�ٳ����� ������� ����");
            }
               
            else { //���� if���� ������ �ƴҰ�����
               System.out.println("�ٳ����� ����� ����");      
            }
                  
            System.out.println("���α׷� ����.");
                  

            }
         
   }

