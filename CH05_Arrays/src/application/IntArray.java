package application;

public class IntArray {

	public static void main(String[] args) {
		// 배열은 같은 타입의 여러 변수를 하나로 묶은 자료형
		int[] numbers = { 2,4,6,8 }; // 정수 int형 배열 선언과 초기값이 {2,4,6,8}
		// 배열에는 index 값이 있는데 시작이 0번 {0,1,2,3}
		// 인덱스 값
		// 0  :  2
		// 1  :  4
		// 2  :  6
		// 3  :  8
		
		// 인덱스 값으로 배열의 실제 값을 가져오는 법 => 배열이름[인덱스번호]
		System.out.printf("인덱스 번호 %d의 값은 %d이다 \n", 0, numbers[0]);
		System.out.printf("인덱스 번호 %d의 값은 %d이다 \n", 1, numbers[1]);
		System.out.printf("인덱스 번호 %d의 값은 %d이다 \n", 2, numbers[2]);
		System.out.printf("인덱스 번호 %d의 값은 %d이다 \n", 3, numbers[3]);
		
		

	}

}
