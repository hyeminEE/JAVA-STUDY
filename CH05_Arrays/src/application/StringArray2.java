package application;

public class StringArray2 {

	public static void main(String[] args) {
		// ���ڿ��� ���� �ڷ���, ���� ����(reference variable)�� �ּҰ��� ������.
		String text = null; // �� ���� �ּҰ��� ���ٴ� ��
		// �� String text -> ����������� ��
		// int x = null; �⺻ �ڷ������� �� ���� �Է� �Ұ�(�� ���� �ּҰ� ���ٴ� ��)
        // text = new String("��ο�");
        // �� ���ڿ�(string) "��ο�"�� ���� �����Ѵ�
        text = "��ο�";
        
        System.out.println(text);
        
        String[] texts = null;
        System.out.println(texts);
        texts = new String[3]; // �迭 ���ڿ�3ĭ�� ���� �����ؼ� texts�� �ּ� �Է�
        System.out.println(texts);
        System.out.println(texts[0]);
        
        texts[0] = new String("����!");
        texts[1] = "�� �� ?";
        texts[2] = "�� ����!";
        
        for(String w : texts) {
        	System.out.println(w);
        }
	
	}

}
