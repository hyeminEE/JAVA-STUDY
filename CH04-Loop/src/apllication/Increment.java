package apllication;

public class Increment {

	public static void main(String[] args) {
		// ���� ���� ������(1�� ���� �Ǵ� ����)
		int count = 0;
		
		count = count + 1;
		// count(0)��� ������ +1 =1 , 1+1 =2 , 2+1 ... // 1�� ���� 
		System.out.println(count);
		count += 1;            // 1�� ���� , c -=1 -> c = c-1
		System.out.println(count);
		count ++;              // 1�� ���� 
		System.out.println(count);
		++count;               // 1�� ����
		System.out.println(count);
		
		// ���� ��Ű��
		
		count = count - 1;
		System.out.println(count);
		count -= 1;            
		System.out.println(count);
		count --;        
		System.out.println(count);
		--count;             
		System.out.println(count);
	}

}
