package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_SortRanking_내풀이 {
/*
 여러 사람들의 기록을 저장할 수 있는 데이터 클래스를 하나 설계하고 
 해당 기록 정보를 클리어 타임순과 점수순으로 출력할 수 있는 프로그램을 만들어보세요
 
 데이터클래스1
 컴퍼레이터 2
 */
	public static void main(String[] args) {
		ArrayList<Fishing> fishing = new ArrayList<>();
		
		fishing.add(new Fishing("이박사", "감성돔", 1, 9999));
		fishing.add(new Fishing("박박이", "상어", 3, 111111));
		fishing.add(new Fishing("김학생", "고등어", 4, 2200));
		fishing.add(new Fishing("마당근", "미꾸라지", 6, 50));
		fishing.add(new Fishing("왕사장", "가자미", 2, 5000));
		fishing.add(new Fishing("강태공", "멸치", 4, 1000));
		fishing.add(new Fishing("황낚시", "피라냐", 10, 6000));
		
		Collections.sort(fishing, new CTRanking());
		System.out.println(fishing);
		System.out.println();
		Collections.sort(fishing, new SRanking());
		System.out.println(fishing);
	}
}

class Fishing { //이 클래스 내부에서 compareTo() 를 override하고 싶지 않으면  implements Comparable<Fishing> 없애고 그냥 일반클래스로 만들기 (다른 건 그냥 건들지 않고 implements Comparable만 때고 일반 클레로 만들어주면 됨)
	
	String name;
	String fish;
	int clearTime;
	int score;

	public Fishing(String name, String fish, int clearTime, int score) {
		this.name = name;
		this.fish = fish;
		this.clearTime = clearTime;	
		this.score = score;
	}

	@Override
	public String toString() {
		return String.format("%s / %s / %d / %d %n", name, fish, clearTime, score);
	}
	
//	@Override
//	public int compareTo(Fishing f) {
//		return 0;
//	}
}


class CTRanking implements Comparator<Fishing> {  

	@Override
	public int compare(Fishing f1, Fishing f2) {
		if (f1.clearTime < f2.clearTime) {
			return -1;
		} else if (f1.clearTime > f2.clearTime) {
			return 1;
		} else {
			if (f1.score > f2.score) {
				return -1;
			} else if (f1.score < f2.score) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}



class SRanking implements Comparator<Fishing> {

	@Override
	public int compare(Fishing f1, Fishing f2) {
		if (f1.score > f2.score) {
			return -1;
		} else if (f1.score < f2.score) {
			return 1;
		} else {
			if (f1.clearTime < f2.clearTime) {
				return -1;
			} else if (f1.clearTime > f2.clearTime) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}


