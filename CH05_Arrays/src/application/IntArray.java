package application;

public class IntArray {

	public static void main(String[] args) {
		// �迭�� ���� Ÿ���� ���� ������ �ϳ��� ���� �ڷ���
		int[] numbers = { 2,4,6,8 }; // ���� int�� �迭 ����� �ʱⰪ�� {2,4,6,8}
		// �迭���� index ���� �ִµ� ������ 0�� {0,1,2,3}
		// �ε��� ��
		// 0  :  2
		// 1  :  4
		// 2  :  6
		// 3  :  8
		
		// �ε��� ������ �迭�� ���� ���� �������� �� => �迭�̸�[�ε�����ȣ]
		System.out.printf("�ε��� ��ȣ %d�� ���� %d�̴� \n", 0, numbers[0]);
		System.out.printf("�ε��� ��ȣ %d�� ���� %d�̴� \n", 1, numbers[1]);
		System.out.printf("�ε��� ��ȣ %d�� ���� %d�̴� \n", 2, numbers[2]);
		System.out.printf("�ε��� ��ȣ %d�� ���� %d�̴� \n", 3, numbers[3]);
		
		

	}

}
