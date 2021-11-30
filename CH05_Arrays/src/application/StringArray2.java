package application;

public class StringArray2 {

	public static void main(String[] args) {
		// 문자열은 참조 자료형, 참조 변수(reference variable)은 주소값을 가진다.
		String text = null; // 널 값은 주소값이 없다는 것
		// ㄴ String text -> 참조변수라고 함
		// int x = null; 기본 자료형에는 널 값을 입력 불가(널 값은 주소가 없다는 뜻)
        // text = new String("헬로우");
        // ㄴ 문자열(string) "헬로우"를 새로 생성한다
        text = "헬로우";
        
        System.out.println(text);
        
        String[] texts = null;
        System.out.println(texts);
        texts = new String[3]; // 배열 문자열3칸을 실제 생성해서 texts에 주소 입력
        System.out.println(texts);
        System.out.println(texts[0]);
        
        texts[0] = new String("하이!");
        texts[1] = "안 녕 ?";
        texts[2] = "굿 바이!";
        
        for(String w : texts) {
        	System.out.println(w);
        }
	
	}

}
