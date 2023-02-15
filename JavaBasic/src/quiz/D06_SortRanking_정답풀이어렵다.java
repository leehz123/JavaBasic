package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_SortRanking_����Ǯ�̾�ƴ� {
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
	
	//����������������������������������������������̰� �ٷ� local Inner ClassȰ�� ���� ��������������������������������������������
	
	
	//Record�� ���ı����̹Ƿ� Record�ȿ� �־������ �������� ���̴°� ������ 
	//(����Ʈ���� ������: ���� �ִ� �͵鳢�� �� ������� ����. �������� ����.)
	// + ���յ��� ���� �� �ִ� ��� ��ĳ���� ���� ��  (���Ƴ��� �� ����)
	//���۷����͸� ���� �ϳ� �ĵ� �ǰ�� �̿��̸� Record�� ���õ� �Ŵϱ� RecordŬ���� �ȿ� �ΰ���. �ٵ� Comparator�� �ν��Ͻ�ȭ�� �� ���� (�̰� ���� �Ҹ�??)��
	final public static Comparator<Record> ORDER_BY_SCORE_DESC = new Comparator<>() {
		@Override
		public int compare(Record r1, Record r2) {
			//return r1.score != r2.score ? r2.score - r1.score : r1.time - r2.time;
			return  Integer.compare(r2.score, r1.score)  == 0 ? Integer.compare(r1.time, r2.time) : Integer.compare(r2.score, r1.score); 
			//�̷��� �ص� ��. Integer�� compare�� ���ǵǾ� �����ϱ� . compare��� �� ��ü�� �� �ͼ������� 
		}
	};
	//�� ���� �߿���. �ν��Ͻ��� �����ϴ� ���ÿ� ��� �޴� ...! �͸������� ORDER_BY_SCORE_DESC��� �̸��� �ٿ����� ���̽�
	//���߿� �ڽ����� �̷��� �޼��带 ���� ORDER_BY_SCORE_DESC�ȿ� �ִ� ���� ���� ����
	//�����������������������������������������������������������������������������������������������������������������������	
	
	
	
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
	
	//�� Comparable<Record>Ŭ������ ���� �긦 �޾Ƴ��´� ���صȴ�. 
	@Override
	public int compareTo(Record r) { //�ð��� ����
		return time != r.time ? time - r.time : r.score - score;
						//    ?   ���� �ʴٸ� �� ����� ������ �� �տ��� ���� ������, ����� �� �ڿ��� ���� ������   :   //���ٸ� score�� ���ض� 
	}
	
}