package application;

public class MultiArray {

	public static void main(String[] args) {
		// ���� �迭[][]
		String[][] texts = {
				{"�ϳ�", "��","��"},
				{"��", "�ټ�","����"},
				{"�ϰ�", "����","��ȩ"}
		};
		
		for (int i = 0; i < texts.length; i++) {
			//system.out.printf("%d��° �迭 %s \n", i, texts[i]);
			//String[] inArray = texts[i];
			
			for(int j = 0; j < texts[i].length; j++ ) {
				System.out.printf("%s \t", texts[i][j]);
			}
			
			System.out.println();
		}
	}

}
