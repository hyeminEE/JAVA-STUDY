package application;

public class Break {

	public static void main(String[] args) {
		// �ݺ��� �ȿ��� break; ���� ��������
		int count = 0;
		
		while(true) {
			System.out.println("��ο�!" + count);
			
			if(count == 5) {
				break;
			}
			
			System.out.println("�Ͼ��� ?");
			
			count++;
		}
		
        System.out.println("����.");
	}

}
