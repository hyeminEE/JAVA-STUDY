package application;

public class NewArray {

	public static void main(String[] args) {
		// new Ű����� �迭�� �����Ѵ�
		// int[] n = {1, 2, 3}; �ʱⰪ�� �ٷ� �ִ� �� - ���ͷ��̶�� �Ѵ�
		//  �� ������ �迭
		int[] numbers;  // ������ �迭 numbers ����
		numbers = new int[3]; // ������ 3���� �迭
                    // �� �游 �������

		numbers[0] = 99;
		numbers[1] = 999;
		numbers[2] = 9999;
		
		int total = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "  ");
			total = total + numbers[i]; // ��� �迭�� ���� ����
		}
		
		System.out.println("�� �հ�� : " + total);
 		
	}

}
