import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_comparator_문제복습_복잡네 {

/*
  
 
# Comparable
Comparable 인터페이스를 구현하는 클래스는 compareTo(Object o) 메서드를 오버라이드 해야 한다.  
compareTo() 는 this 인스턴스와 매개변수로 들어온 인스턴스를 비교함. 


# Comparator
Comparator 인터페이스를 구현하는 클래스는 compare(Object o1, Object o2) 메서드를 오버라이드 해야 한다. 
compare()는 o1 인스턴스와 o2 인스턴스를 비교
 

** compareTo()와 compare()의 매개변수 타입 변경 가능 (다운캐스팅)

** Integer, String 등 Collections에 쓰이는 기본 클래스들은 Comparable이 이미 구현돼 있기 때문에 직접 구현할 필요가 없다. 
 
 */
	
	
	public static void main(String[] args) {
		
		//Integer에서 f3를 눌러서 Integer로 이동해보면 comparable이 구현돼 있음 
		//public final class Integer extends Number implements Comparable<Integer> {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(5);
		numbers.add(-1);
		numbers.add(3);
		numbers.add(-11);
		System.out.println(numbers);
		Collections.sort(numbers); 
		//숫자(Integer)는 어떻게 정렬해야할지 너무나 명확해서 자바가 어떻게 정렬하라고 미리 만들어둠
		
		
		
		
		
		ArrayList<Grape> grapes = new ArrayList<>();
		grapes.add(new Grape(3000, 33, 1, "대한민국"));
		grapes.add(new Grape(3000, 33, 1, "대한민국만세"));
		grapes.add(new Grape(3000, 33, 1, "대한민국1"));
		grapes.add(new Grape(3000, 33, 1, "대한민"));
		grapes.add(new Grape(3000, 33, 1, "대한"));
		grapes.add(new Grape(3000, 33, 1, "대한김"));
//		grapes.add(new Grape(3000, 33, 1, "칠레"));
//		grapes.add(new Grape(3000, 55, 2, "프랑스"));
//		grapes.add(new Grape(3000, 56, 2, "프랑스"));
//		grapes.add(new Grape(3200, 28, 3, "프랑스"));
//		grapes.add(new Grape(3200, 31, 1, "칠레"));
//		grapes.add(new Grape(3300, 50, 1, "스페인"));
//		grapes.add(new Grape(3300, 51, 0, "우루과이"));
//		grapes.add(new Grape(3300, 55, 1, "스페인"));
		System.out.println(grapes);
		//Collections.sort(grapes); //빨간줄 나옴. price, qty, color, origin 중에 멀로 정렬이 되야 하느냐 
		//근데 우리가 만든 Grapes타입에 대해선 뭐로 정렬해야 할 지 기준이 없음. 
		
//정리. Integer에는 sort의 기준이 있지만 Grape에는 아직 기준이 없으므로 직접 작성해야 한다. 
	
		//implements Comparable 하고 compareTo()을 오버라이딩 하고 나서는 에러가 뜨지 않는다. 
		Collections.sort(grapes);
		System.out.println(grapes);
		
		
		
		//compareTo()만 따로 쓰기 
		//grapes.get(0) 이 this이고, grapes.get(3)이 매개변수로 들어가는 인스턴스인 셈.
		System.out.println(grapes.get(0).compareTo(grapes.get(3)));
		
		
		//Collections.sort(리스트, 컴퍼레이터) : 해당 리스트를 컴퍼레이터로 정렬하시오 
		Collections.sort(grapes, new 포도분류기());  
		System.out.println(grapes);
	}
}





			//인터페이스를 달아주면 내가 반드시 구현해야 하는 메서드가 있지 
class Grape implements Comparable { //포도는 비교가 가능한 클래스라는 것을 표시    
						//근데 사실 Comparable은 제네릭을 지정 가능 Comparable<Grape> 이렇게 해주면 object타입으로 받지 않고 Grape타입으로 받음. 
						//그러면 밑에서 CompareTo() 오버라이딩할 때 Grape g = (Grape)o; 이렇게 다운캐스팅 안 해줘도 됨
	
	int price;
	int qty; //몇알 들어있냐
	int color;
	String origin;
							//color pick 구글 #을 0x라고 하는거?
	static String[] colors = {"0x48258A", "0x00C72E", "0x00C72E", "0x00C72E", "0x00C72E"};
	
	public Grape(int price, int qty, int color, String origin) {
		this.price = price;
		this.qty = qty;
		this.color = color;
		this.origin = origin;
	}
	
	@Override
	public String toString() {
		return String.format("%d/%d/%s/%s", price, qty, colors[color], origin);
	}

	
	
	
	
	
	@Override			//o에는 어떤 타입이든 올 수 있지만 자기자신 인스턴스와 비교하려면 다운캐스팅을 해줘야 함
	public int compareTo(Object o) {
		
		/*
		# compareTo의 규칙
		this.(==인스턴스)와 매개변수로 전달되는 o.(==역시 인스턴스)를 비교한다. 
		두 인스턴스의 비교 결과에 따라 알맞은 정수를 리턴. (-1, 0, 1) 
		
		this. 인스턴스를 왼쪽에 두고 싶으면 return -1; (혹은 양수 리턴) 
		this. 인스턴스를 오른쪽에 두고 싶으면 return 1; (혹은 음수 리턴) 
		그대로 두려면 return 0; 
		 */
		
		
		/*
				 //비교는 포도끼리 할 거기때문에 다운캐스팅 해도 문제 없음 
		Grape g = (Grape)o; 
		if(this.qty > g.qty) {  
			return -1; // this.qty를 왼쪽에 두겠다 == 큰 것부터 등장 == 오름차순 하겠다. 
		} else if (this.qty < g.qty) {
			return 1;
		} else {
			return 0;
		}
				
		*/
		
		
// 문제1________________________________________________________________________________________________

		// 포도가 가격 기준으로 오름차순으로 정렬될 수 있도록 바꿔보세요. 가격이 같을 때는 개수로 내림차순.

		/*
		Grape g = (Grape)o;
		if(this.price < g.price) {
			return -1;
		} else if (this.price > g.price) {
			return 1;
		} else {
			
			if (this.qty > g.qty) {
				return -1;
			} else if(this.qty < g.qty) {
				return 1;
			} else {
				return 0;
			}
			
		}
		 */
		
		
// 심화문제__________________________________________________________________________________		
		 
		/*
		
		원산지 이름 기준으로 오름차순 정렬해보세요. 
		 
		고양이
		강아지
		
		사과
		사과파이
		사과주스
		사과쥬스
		사과청
		이렇게 정렬 되야 함. 무조건 글자수대로 정렬하는게 옮은 것이 아님
		
		*/
		
// 일단 Grape클래스가 implements Comparable 할 때 <Grape>로 지정 안 해줬으니 Object에서 (Grape)로 형변환 해주기 
		Grape g = (Grape)o;
		
		
// 비교하는 두 문자열의 길이가 차이날 경우도 처리 해줘야 함 
		
		// 일단 두 인스턴스의 origin에 담긴 문자열의 길이를 len1, len2에 담아주기 
		int len1 = origin.length();
		int len2 = g.origin.length();
		
		// len1과 len2 둘 중 더 짧은 문자열 길이를 len에 저장
		// "대한"과 "대한민" 비교할 때 대한까지만 비교하고 끝나도록 하기 위함 
		int len = len1 < len2 ? len1 : len2; 
		
		// len에 담긴 글자수까지만 비교
		for(int i = 0; i < len; ++i) {
			char ch1 = origin.charAt(i);
			char ch2 = g.origin.charAt(i);
			
			
			if (ch1 > ch2) {
				return 1;
			} else if (ch1 < ch2) {
				return -1;
			} //이렇게 하면 첫글자~len 글자까지 비교하면서 this인스턴스가 왼쪽에 갔다가 오른쪽에 갔다가 하겠지.
			
		}// 여기까지 하고 나면 일단 len글자까지는 비교 완료.  
		// 여기서 else {return 0;}을 해버리면 글자수로 하는 비교는 이뤄지지 않것지
		// "대한" 과 "대한민" 에 대한 비교가 이뤄지지 않을 거란 뜻. 
		// 그에대한 처리는 for문 밖에 다른 if문으로 처리해줘야 함. 
		
		if (len1 < len2) {
			return -1;
		} else if (len1 > len2) {
			return 1;
		}
		return 0;	
	}
}

/* 
이건 또 머여 ㅅㅂ
@Override 
public int compareTo(Grape g) {
	return this.origin.compareTo(g.origin);
}
*/




/*


근데 다른 정렬 기준을 또 만들고 싶을 수도 있잖음? 
Comparable()를 두번 상속 받을 수도 없고 어쩌면 좋을까?
이럴 때 사용하는 것이 바로 Comparator!

Comparator 는 클래스를 여러개 팔 수 있음. 이걸 익명내부클래스로도 만들 수 있지(내 블로그에 남의 글 퍼온거 참고) 

그리고 compareTo() 나 compare() 오버라이드 할 때 if문보다 간단한 방법이 있는데
그 방법은 바로 '빼기방식'! 
예) return qty - o.qty;
단, 빼기 방식으로 할 때는 오버플로나 언더플로를 조심하기


*/


class 포도분류기 implements Comparator<Grape> {
	@Override
	public int compare(Grape g1, Grape g2) {
		return g1.price != g2.price ? g1.price - g2.price : (g2.qty - g1.qty);
		//이게 문제 1번을 빼기 방식으로 푼 것. 열라 간단하지
	}	
}





