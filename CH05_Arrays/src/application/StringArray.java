package application;

public class StringArray {

	public static void main(String[] args) {
		// ���ڿ� Ÿ������ ���� �迭
		
		String[] animals = {"�����", "��", "���", "����"};
	
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);

		// �迭���� ���� �ٲٴ� ���
		animals[0] = "��";
		
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);
		
    }
}