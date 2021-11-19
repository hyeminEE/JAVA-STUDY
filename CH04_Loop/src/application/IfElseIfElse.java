package application;

import java.util.Scanner;

public class IfElseIfElse {

   public static void main(String[] args) {
      // 스캐너
            Scanner scanner = new Scanner(System.in);
                  
            System.out.println("사과의 갯수는?");
            int apple = scanner.nextInt();
            System.out.println("바나나의 갯수는?");
            int banana = scanner.nextInt();
            scanner.close(); //스캐너 종료(더이상 안쓸때)
                  
            if(apple > banana) {
               System.out.println("사과가 바나나보다 많음");
            }
            //  ㄴ 위에게 아닐때 else if가 실행, else if도 아닐경우 else가 실행
            
            else if(apple < banana) { // 또 다른 조건은 else if(조건)을 사용한다.
               System.out.println("바나나가 사과보다 많음");
            }
               
            else { //위의 if문의 조건이 아닐경우실행
               System.out.println("바나나가 사과가 같음");      
            }
                  
            System.out.println("프로그램 종료.");
                  

            }
         
   }

