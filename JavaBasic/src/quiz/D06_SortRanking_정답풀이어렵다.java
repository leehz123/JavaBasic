package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_SortRanking_정답풀이어렵다 {
	public static void main(String[] args) {
		
		
		ArrayList<Record> records = new ArrayList<>();
		records.add(new Record("KHJ", 1000, 33000));
		records.add(new Record("LEE", 800, 40000));
		records.add(new Record("KIM", 3300, 21000));
		records.add(new Record("JJJ", 2200, 3000));
		records.add(new Record("KKK", 2200, 3000));;
		records.add(new Record("AAA", 2200, 22000));;
		records.add(new Record("BBB", 2200, 31000));;
		records.add(new Record("ABC", 2200, 13583));;
		
//		Collections.sort(records);
//		System.out.println(records);	
		
		Collections.sort(records, Record.ORDER_BY_SCORE_DESC);
		System.out.println(records);
	}
}

class Record implements Comparable<Record>{
	
	//▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲이게 바로 local Inner Class활용 예시 ▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲
	
	
	//Record의 정렬기준이므로 Record안에 넣어놓으면 응집도를 높이는게 좋을듯 
	//(소프트웨어 응집도: 관련 있는 것들끼리 잘 묶어놓은 정도. 높을수록 좋다.)
	// + 결합도를 낮출 수 있는 방법 업캐스팅 같은 거  (갈아끼울 수 있음)
	//컴퍼레이터를 따로 하나 파도 되겠찌만 이왕이면 Record와 관련된 거니까 Record클래스 안에 두겠음. 근데 Comparator는 인스턴스화할 수 없네 (이게 무슨 소리??)ㄴ
	final public static Comparator<Record> ORDER_BY_SCORE_DESC = new Comparator<>() {
		@Override
		public int compare(Record r1, Record r2) {
			//return r1.score != r2.score ? r2.score - r1.score : r1.time - r2.time;
			return  Integer.compare(r2.score, r1.score)  == 0 ? Integer.compare(r1.time, r2.time) : Integer.compare(r2.score, r1.score); 
			//이렇게 해도 됨. Integer에 compare이 정의되어 있으니까 . compare라는 거 자체에 좀 익숙해지기 
		}
	};
	//이 문법 중요함. 인스턴스를 생성하는 동시에 상속 받는 ...! 익명이지만 ORDER_BY_SCORE_DESC라고 이름을 붙여놓은 케이스
	//나중에 자스가면 이렇게 메서드를 만들어서 ORDER_BY_SCORE_DESC안에 넣는 형태 많이 나옴
	//▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲	
	
	
	
	String name;
	int time;
	int score;
	
	
	
	
	public Record(String name, int time, int score) {
		this.name = name;
		this.time = time;
		this.score = score;
	}

	@Override
	public String toString() {
		return String.format("name : %s, time:  %s, score : %d %n", name, time, score);
	}
	
	//아 Comparable<Record>클래스로 만들어서 얘를 달아놓는대 이해된다. 
	@Override
	public int compareTo(Record r) { //시간순 정렬
		return time != r.time ? time - r.time : r.score - score;
						//    ?   같지 않다면 뺀 결과가 음수일 때 앞에게 먼저 나오고, 양수일 땐 뒤에게 먼저 나오게   :   //같다면 score로 비교해라 
	}
	
}