package quiz;
//연습문제. static자원을 포함한 클래스를 하나 정의해보세요. 
//너비, 높이, 카드모양 금지 
//그니까 인스턴스 > static 은 가능하고 static > 인스턴스로 접근은 불가능하다는 거지?

public class C04_static연습문제_static변수수정하고아이디어추가 {
	public static void main(String[] args) {
		
		CustomCoffee.guide();
		//CustomCoffee c1 = new CustomCoffee(); 아 맞다 기본자동생성자가 막혀있지
		
		//CustomCoffee c1 = new CustomCoffee(int base, int shot, int iceHot);;
		CustomCoffee c1 = new CustomCoffee(0, 4, 0);
		
		//친환경 ver. (기본값인 셈. static 이용)
		System.out.println("~~~~~~~~~~~~~~~~환경 보호 ing~~~~~~~~~~~~~~~");
		System.out.println("컵	:	" + CustomCoffee.cup);
		System.out.println("빨대	:	" + CustomCoffee.straw);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//반환경 ver. 
		c1.antiEco("플라스틱 컵", "플라스틱 빨대");
		
		//설탕, 휘핑크림 선택
		c1.sweetness(true, true);
		
		
		System.out.println();
		System.out.println();
		
		c1.orderSheet();
		
		//
		
	}
}

class CustomCoffee {
	//static 변수
	static String cup = "머그컵";
	static String straw = "종이 빨대";
	//플라스틱 빨대를 원하는 손님이 static메소드로 빨대를 변경해버림. 그 이후부터는 그럼 아예 플라스틱 빨대로 쭉 가는 것
	//그러니까 머그컵과 종이빨대를 static말고 인스턴스 변수로 설정해서 기본값으로 설정하는 편이 더 나음.
	//그럼 static 뭘로 할까?? static 뭐로 하는게 좋을까? 
	//그리고 이 프로그램은 그냥 무난무난함. 새롭고 참신한 아이디어 추가해보기 
	//아 또 실외로 나가는 사람 플라스틱 컵 줘야지 그것도 생각하셈
	
	static String[] bases = {"물", "우유"};
	static char[] shots = {'1', '2', '3', '4'};
	static String[] iceOrHot = {"아이스", "핫"}; 
	
	//인스턴스 변수
	int orderNumber;
	boolean sugar = false;
	boolean cream = false;
	int base;
	int shot;
	int iceHot;
	
	//
	public static void guide() {
		System.out.println("________________________주문 가이드__________________________");
		System.out.println("환경정책에 따라 플라스틱 컵과 빨대의 사용이 금지되어 있습니다. ");
		System.out.println("컵 : " + CustomCoffee.cup);
		System.out.println("빨대 : " + CustomCoffee.straw);
		System.out.println("#########커스텀 메뉴#########");
		System.out.println("base - 물: 0 /우유: 1");
		System.out.println("shot - 1 /2 / 3 / 4");
		System.out.println("iceHot - 아이스: 0 / 핫: 1");
		System.out.println("###########################");
		System.out.println("<주문하시려면 생성자를 만들어주세요. | 인자 : base, shot, iceHot>");
		System.out.println("___________________________________________________________");
		System.out.println();
		
		
	}
	
	
	//생성자
	public CustomCoffee(int base, int shot, int iceHot) {
		this.base = base;
		this.shot = shot;
		this.iceHot = iceHot;	
		orderNumber++;
		System.out.println("주문내역을 확인하세요~!");
		System.out.println("베이스	: " + base);
		System.out.println("샷	: " + shot);
		System.out.println("아이스/핫	: " + iceHot);
		System.out.println("주문번호	: " + orderNumber);
		System.out.println();
	}
	
	//static 메서드
	public static void antiEco(String cup, String straw) {  
		CustomCoffee.cup = cup;
		CustomCoffee.straw = straw;
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~환경보호정책 완화~~~~~~~~~~~~~~");
		System.out.printf ("	빨대	: 	%s\n", CustomCoffee.straw);
		System.out.printf ("	컵	:	%s\n", CustomCoffee.cup);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	
	//인스턴스 메서드
	public void sweetness (boolean sugar, boolean cream) {
		this.sugar = sugar;
		this.cream = cream;
		
		System.out.println("설탕? : " + sugar);
		System.out.println("크림? : " +cream);
	}
	
	
	//인스턴스 메서드
	public void orderSheet() {
		
		System.out.println("주문번호 : " + orderNumber);
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒주문서▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("컵 : " + cup);
		System.out.println("빨대 : " + straw);
		System.out.println("베이스 : " + bases[base]);
		System.out.println("샷 : " + shots[shot - 1]);
		System.out.println("아이스 / 핫 : " + iceOrHot[iceHot]);
		System.out.println("설탕 : " + sugar);
		System.out.println("휘핑크림 : " + cream);
	}
	
	
 }













