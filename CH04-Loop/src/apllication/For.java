package apllication;

public class For {

	public static void main(String[] args) {
		// for �ݺ��� for(�ʱⰪ;����;����){��ɹ�;}
		// for(int i=0; i<=10; i++) {
			// i�� 0�� �ʱⰪ, i�� 10���� ���� ���ȿ���(������ ���Ͻ�) {} ���ȣ���� ����ϰ� ��� ����
			// System.out.println("i: " + i);}
		
		
		// for(;;) {���ѹݺ�
		// System.out.println("��ο�!");}
		
		int total = 0;
		for(int i=0; i<=100; i++) {
			total += i;		
		}
		System.out.println(total);
	}

}
