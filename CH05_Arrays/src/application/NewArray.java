package application;

public class NewArray {

	public static void main(String[] args) {
		// new 키워드로 배열을 생성한다
		// int[] n = {1, 2, 3}; 초기값을 바로 넣는 법 - 리터럴이라고도 한다
		//  ㄴ 정수형 배열
		int[] numbers;  // 정수형 배열 numbers 선언
		numbers = new int[3]; // 정수형 3개의 배열
                    // ㄴ 방만 만들어줌

		numbers[0] = 99;
		numbers[1] = 999;
		numbers[2] = 9999;
		
		int total = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "  ");
			total = total + numbers[i]; // 모든 배열의 값을 더함
		}
		
		System.out.println("총 합계는 : " + total);
 		
	}

}
