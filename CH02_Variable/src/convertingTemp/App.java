package convertingTemp;

public class App {

	public static void main(String[] args) {
		// ¼·¾¾ ¿Âµµ¸¦ È­¾¾ ¿Âµµ·Î º¯È¯(0¡É x 9/5) + 32 = 32¢µ
		
		double c = 17.0; // ¼·¾¾ º¯¼ö cÃÊ±â°ªÀ» 25
		double f = (c * 9/5) + 32; // È­¾¾ º¯¼ö f´Â °ø½Ä´ë·Î
		
		System.out.println("¼·¾¾" + c + "´Â È­¾¾" + f + "ÀÌ´Ù.");
	}

}
