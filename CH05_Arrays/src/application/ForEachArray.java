package application;

public class ForEachArray {

	public static void main(String[] args) {
		// �迭�� ����� �� �ִ� �ݺ��� for each
		// ������ �迭�� �ݺ����� for each���� ����ϰ� �ε��� ��ȣ�� �ʿ��� ��� for���� ���
		String[] fruits = {"�ٳ���", "���", "����"};
		int[] n = {1, 2, 3};
		boolean[] b = {true, false, true};
		double[] d = {1.1, 2.2, 3.3, 4.4,};
		
		for(String x : fruits) { // for each���� (���� : �迭)
			System.out.print(x + "  ");}
		System.out.println();
		
		for(int x : n) { 
			System.out.print(x + "  ");}
		System.out.println();
		
		for(boolean x : b) { 
			System.out.print(x + "  ");}
		System.out.println();
		
		for(double x : d) {
			System.out.print(x + "  ");}
		System.out.println();
		

	}

}
