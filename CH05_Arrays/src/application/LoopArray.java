package application;

public class LoopArray {

	public static void main(String[] args) {
		// 문자열 타입으로 만든 배열
		
		String[] animals = {"고양이", "개", "펭귄", "사자"};
	
//		System.out.println(animals[0]);
//		System.out.println(animals[1]);
//		System.out.println(animals[2]);
//		System.out.println(animals[3]);

	// 반복문 for문 인덱스 번호를 i로 
		for(int i = 0; i <4; i++) {
			//            ㄴ 4 대신 animals.lenght; 를 적어주면 animals안에 있는 모든게 다 나옴
			System.out.printf("인덱스 %d번은 %s이다\n", i, animals[i]);
		}
			
    }
}