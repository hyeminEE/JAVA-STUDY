package application;

public class Break {

	public static void main(String[] args) {
		// 반복문 안에서 break; 사용시 빠져나옴
		int count = 0;
		
		while(true) {
			System.out.println("헬로우!" + count);
			
			if(count == 5) {
				break;
			}
			
			System.out.println("하아유 ?");
			
			count++;
		}
		
        System.out.println("종료.");
	}

}
