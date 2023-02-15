package quiz;

import java.util.Scanner;

public class B02º¹½ÀÇØ_ConditionQuiz2 {
	public static void main(String[] args) {
		// #¾Ë¸ÂÀº Á¶°Ç½ÄÀ» ¸¸µé¾îº¸½Ã¿À
		// 1. charÇü º¯¼ö a°¡ 'q' ¶Ç´Â 'Q'ÀÏ ¶§ t
		String a = "q";
		System.out.println(a.equalsIgnoreCase("q"));
		
		// 2. charÇü º¯¼ö b°¡ °ø¹éÀÌ³ª ÅÇÀÌ ¾Æ´Ò ¶§ true
		/*
		 ³» Ç®ÀÌ. String b =" "; 
		 System.out.println((b.equals(" "))||(b.equals("\t")));
		 ±Ùµ¥ ±×³É ==À¸·Î ºñ±³ÇÏ½É ±×¸®°í '¾Æ´Ò ¶§'ÀÎµ¥ .equalsÇØ¼­ Æ²¸²
		 */
		
		// Á¤´ä Ç®ÀÌ.
		char b = '\t';
		System.out.println(b != ' ' && b != '\t');

		// 3. charÇü º¯¼ö c°¡ '0'~'9'ÀÏ ¶§ true
		char c = '5';
		System.out.println('0' <= c && c <= '9');

		// 4. charÇü º¯¼ö d°¡ ¿µ¹®ÀÚ(´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ)ÀÏ ¶§ t
		char d = 'g';
		System.out.println(('a' <= d && d <= 'z') || ('A' <= d && d <= 'Z'));
		// ±»ÀÌ ¼ýÀÚ ¿Ü¿ö¼­ ¾²Áö ¸»¶õ ¸»¾ß~~~~

		// 5. charÇü º¯¼ö e°¡ ÇÑ±ÛÀÏ ¶§ true
		// http://unicode.org/charts/¿¡¼­ Hangul Syllables·Î µé¾î°¡¸é
		// AC00 ~ D7A3 (°è»ê±â·Î ½ÊÁø¼ö·Î ¹Ù²Ù¸é 44032~55203)
		char e = 'ÆR';
		System.out.println((char) 44032);
		System.out.println((char) 55203);

		System.out.println(e >= 44032 && e <= 55203); // ÀÌ°Ô º£½ºÆ®
		System.out.println(e >= '°¡' && e <= 'ÆR');// ÀÌ °æ¿ì¿¡´Â ¿ÀÈ÷·Á °¡¿Í ÆRÀ» ¿Ü¿ì´Â°Ô ´õ ¹ø°Å·Î¿î °Å.

		// »ç½Ç ÀÚ¹Ù¿¡¼­ 16Áø¼ö¸¦ Á÷Á¢ »ç¿ëÇÒ ¼öµµ ÀÖÀ½
		// 16Áø¼ö¸¦ »ç¿ëÇÒ ¶© ¾Õ¿£ 0xºÙ¿©ÁÖ¸é µÊ 0xAC00 ÀÌ·¸°Ô ¡Ú¡Ú¡Ú¡Ú
		System.out.println(e >= 0xAC00 && e <= 0xD7AF);

		// 6. charÇü º¯¼ö f°¡ ÀÏº»¾îÀÏ ¶§ true
		char f = 'ªÒ';
		// Hiragana·Î µé¾î°¡¸é ÀÏ¾î ¹üÀ§ 3040 ~ 309F
		System.out.println("f°¡ ÀÏº»¾îÀÎ°¡¿ä?" + (f >= 0x3040 && f <= 0x309F));

		// 7. »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ¹®ÀÚ¿­ÀÌ exitÀÏ ¶§ true
		/*
		Scanner sc = new Scanner(System.in); 
		String command = sc.nextLine();¸¦ ¾Æ·¡ ÇÑ ÁÙ·Î
		 */
		System.out.println("¹®ÀÚ¿­À» ÀÔ·ÂÇÏ¼¼¿ä");
		String command = new Scanner(System.in).next();
		System.out.println(command.equals("exit"));
	}
}
