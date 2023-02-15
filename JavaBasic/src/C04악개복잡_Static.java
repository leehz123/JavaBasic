/*
# static (정적 영역, 클래스 영역 <=> 인스턴스 영역)
같은 클래스의 모든 인스턴스가 공동으로 사용하는 영역을 정적 영역이라고 한다. 
쿠키런 곰젤리 (+100점) 인스턴스가 공중에 100개 떠 있고 점수는 하나 당 동일하게 +100점
그러면 인스턴스 100개 다 점수를 저장해줄 필요 없이 점수에 대한 정보는 정적영역에 저장해놓고 공중에 떠 있는 100개의 곰젤리가 그 정보를 바라보고 있는 것.  
앞에 static이 붙은 자원(필드 또는 메서드)은 모든 인스턴스가 공동으로 사용하는 자원이 된다.

static영역의 자원은 아무리 인스턴스가 많아도 클래스 당 하나이기 때문에
클래스 이름에 .을 찍고 사용할 수 있다. PlayingCard.width++; 

★★★★★★static영역의 자원은 인스턴스가 생기기 전에도 사용할 수 있다!!!!★★★★★★
(카드를 하나도 만들지 않은 시점에 너비와 높이를 사용할 수 있다.)
(System.out.println(PlayingCard.height);)

static메서드는 (인스턴스가 생기기 전에도 사용할 수 있기 때문에) 인스턴스 변수를 가져다 사용할 수 없다.
그래서 인스턴스 변수를 활용하는 메서드는 반드시 인스턴스 메서드여야 한다.
따라서  
static필드만 사용하는 메서드는 static메서드로 만드는 것이 좋다. 
인스턴스 변수를 활용하는 메서드는 반드시 인스턴스 메서드여야 한다. 

*/


public class C04악개복잡_Static {
	public static void main(String[] args) {
		
		PlayingCard.changeSize(0, 0); //이건 머야 마지막에 넣던데 
		
		PlayingCard h1 = new PlayingCard(1, 1);
		PlayingCard s1 = new PlayingCard(1, 1);
		PlayingCard d10 = new PlayingCard(1, 10);
		
		PlayingCard.width++; 
		//h1.width++;라고 하면 h1보다 클래스 이름을 찍고 하는게 더 정적인 방법 static way다 하면서 노란줄 치고 조언해줌 
		
		for(int i = 0; i < 5; ++i) {
			PlayingCard.width++;
			h1.print();
			s1.print();
			d10.print(); //프린트할 때마다 카드의 너비가 늘어난대 (?????????)
		}
		
		System.out.println(h1.width);
		System.out.println(s1.width); //둘 다 100나옴 
		
		//근데 d10의 너비를 바꾸면 다 바뀌어버림 (꼭 d10아니고 h1, s1이 바뀌어도)
		//d10.width = 10000;
		
		System.out.println(h1.width);
		System.out.println(s1.width);
		System.out.println(d10.width);
		//static이 혼자만의 영역이 아니라는 것!
		d10.width = 3;
		
		h1.print();
		s1.print();
		d10.print();
	}	
}

class PlayingCard {
	//모든 인스턴스가 함께 사용할 값(static영역, 클래스 영역, 정적 영역)
	static int width =100;
	static int height =200;  //너비가 100이고 높이가 200인건 같아야 한다. h1이든 s1이든 ..
	
	static char[] suits = {'♥', '♠' ,'◆', '♣'};
	//카드를 하나만 만들 건 아니잖아?
	//모든 카드들이 번호는 달라도 각 번호별 문양은 똑같이 대응하니까 이런 것도 static의 대상이 된다. 
	
	//각 인스턴스가 자기만의 공간을 가지고 사용할 값(인스턴스 영역)
	int suit; //모양
	int num;
	
	
	public static void changeSize(int width, int height) {
		//this는 인스턴스가 생겼을 떄 자기 자신을 의미하므로 static메서드에서는 사용할 수 없다. 
		//void만 썼던 메서드에서는 됐었찌?
		PlayingCard.width = width; //여기선 또 this가 안 됨!!!!!!this가 인스턴스가 만들어졌을 떄 자기 자신이기 떄문
		PlayingCard.height = height; 
		System.out.println("바뀐 너비 : " + PlayingCard.width);
		System.out.println("바뀐 높이 : " + PlayingCard.height);
		
		//System.out.println("현재카드의 문양 : " + suits[suit]); 이건 안 됨 
		//static영역이 모든 카드가 바라보고 있는 곳이니까 각각의 카드 모양도 구할 수 있지 않을까? >> 아님 
		//인스턴스가 아직 생기지 않은 시점일 수도 있다니깡. static입장에서 인스턴스영역(각자가 다를 수 있는 영역)은 볼 수 없다(번호 찍는 거 불가)
		//static메서드는 ★철저하게★ static영역의 것만 사용!!!!!
	}
	
	
	
	public PlayingCard(int suit, int num) {
	 this.suit = suit;
	 this.num = num;
	}
	
	public void print() {
		System.out.print("┌───");
		for(int i = 0; i < width; ++i) {
			System.out.print('─'); //width만큼 가로를 증가시키는 거쥐.. 아 머리 터지것네 
		}
		System.out.println("───┐");  //그리고 오른쪽마무리부분은 출력하고나서 줄바꿈 해줘야됨
		
		System.out.printf ("│   %c%2d", suits[suit], num);
		
		for(int i = 0; i < width; ++i) {
			System.out.print(' ');
		}
		System.out.println("│");
		
		
		System.out.print("└───");
		
		for(int i = 0; i < width; ++i) {
			System.out.print('─');
		}
		
		System.out.println("───┘");
	}
	
}