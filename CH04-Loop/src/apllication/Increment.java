package apllication;

public class Increment {

	public static void main(String[] args) {
		// 증가 감소 연산자(1씩 증가 또는 감소)
		int count = 0;
		
		count = count + 1;
		// count(0)라는 변수에 +1 =1 , 1+1 =2 , 2+1 ... // 1씩 증가 
		System.out.println(count);
		count += 1;            // 1씩 증가 , c -=1 -> c = c-1
		System.out.println(count);
		count ++;              // 1씩 증가 
		System.out.println(count);
		++count;               // 1씩 증가
		System.out.println(count);
		
		// 감소 시키기
		
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
