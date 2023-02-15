package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_SortRanking_��Ǯ�� {
/*
 ���� ������� ����� ������ �� �ִ� ������ Ŭ������ �ϳ� �����ϰ� 
 �ش� ��� ������ Ŭ���� Ÿ�Ӽ��� ���������� ����� �� �ִ� ���α׷��� ��������
 
 ������Ŭ����1
 ���۷����� 2
 */
	public static void main(String[] args) {
		ArrayList<Fishing> fishing = new ArrayList<>();
		
		fishing.add(new Fishing("�̹ڻ�", "������", 1, 9999));
		fishing.add(new Fishing("�ڹ���", "���", 3, 111111));
		fishing.add(new Fishing("���л�", "����", 4, 2200));
		fishing.add(new Fishing("�����", "�̲ٶ���", 6, 50));
		fishing.add(new Fishing("�ջ���", "���ڹ�", 2, 5000));
		fishing.add(new Fishing("���°�", "��ġ", 4, 1000));
		fishing.add(new Fishing("Ȳ����", "�Ƕ��", 10, 6000));
		
		Collections.sort(fishing, new CTRanking());
		System.out.println(fishing);
		System.out.println();
		Collections.sort(fishing, new SRanking());
		System.out.println(fishing);
	}
}

class Fishing { //�� Ŭ���� ���ο��� compareTo() �� override�ϰ� ���� ������  implements Comparable<Fishing> ���ְ� �׳� �Ϲ�Ŭ������ ����� (�ٸ� �� �׳� �ǵ��� �ʰ� implements Comparable�� ���� �Ϲ� Ŭ���� ������ָ� ��)
	
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


