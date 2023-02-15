
public class C07_StringFormat {
public static void main(String[] args) {
		System.out.printf("%d\n", 0x10); //16
		//위에걸 문자열로 만들고 싶을 때
		
		String time = String.format("%d시 %d분 %d초", 10, 59, 59);
		//문자열로 출력을 하는게 아니라 저장을 하고 싶을 떄  String.format();을 이용
		// String.format() 서식을 이용해 문자열을 생성. 
		//이걸 출력하려면 System.out.println(time);을 해줘야.  
	
		
		//다른 메서드에서 리턴하는 String.format()의 결과를 출력하고 싶으면 
	    System.out.println(getStr()); 
	    //이런 방법도 있지만
	    
	    //이렇게 getStr()메서드를 인스턴스화해서 참조변수에 담아서 참조변수를 출력해도 됨. 
	    String message = getStr();
		System.out.println(message); 
		
	}


	public static String getStr() {
		return String.format("오늘의 로또 번호는 [%d, %d, %d, %d, %d, %d, %d] 입니다.",
				1, 2, 3, 4, 5, 6, 7);	
	}
}
