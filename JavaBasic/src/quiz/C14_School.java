package quiz;

import java.util.Arrays;
import java.util.Random;

/*
1. ���α׷��ֹ� �л����� ������ ����, ����, ����, ���α׷��� ���, �ڷ� ����, �ü�� ������ �ִ�. 
2. ��Ʈ��ũ�� �л����� ������ ����, ����, ������, ��Ʈ��ũ, CCNA ������ �ִ�. 
3. �ӽŷ��׹� �л����� ������ ����, ����, ����, �����, ���α׷��� ��� ������ �ִ�. 
 
100���� �л��� �������� �����Ѵ�. 
��� �л��� �Ҽ� ��, ���� ����, �̸��� �������� �����ž� �ϰ�,
�й��� �ߺ� ���� ���������� �����ž� �Ѵ�.  (A00001 �̷� ������ �ص��ǰ���)

5. ����ǥ ��� �޼��带 ���� �� �л��� [�̸�/�� ���� ����/����/���] �� ���� �� �־�� �Ѵ�.   
*/

public class C14_School {
	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println(student);

	}
}

interface Grading {
	public void getGrading(int score);
}

class Student {
	static Random ran;
	static StringBuilder builder;
	String randomClass;
	String randomName;
	int randomSID;
	int randomScore;
	
	String randomStudent;
	
	public String[] names = new String[lastNum * middleNum * firstNum];

	
	private final static String[] Classes = 
		{"���α׷��ֹ�", "��Ʈ��ũ��", "�ӽŷ��׹�"};
	
	private final static String[] LAST = 
		{"��", "��", "��", "��"};
	
	private final static String[] MIDDLE = 
		{"��", "��", "��", "��", "��", "��", "��"};
	
	private final static String[] FIRST = 
		{"��", "ȣ", "��", "��", "��", "��", "��", "��"};
	
	static int lastNum = LAST.length;
	static int middleNum = MIDDLE.length;
	static int firstNum = FIRST.length;

	Student() {
		randomStudent();
	}
	
	public void randomStudent() {
		randomClass();
		randomName();
		randomSID();
	}
	
	public String randomClass() {
		ran = new Random();
		int randomIndex = ran.nextInt(3);
		randomClass = Classes[randomIndex];
		return randomClass;
		
		//�ߺ����� �ϴ� �� �ϴ� ���� 
	}
	
	public String randomName() {
		int index = 0;
		int randomIndex = ran.nextInt(names.length);
		
		for(int i = 0; i < lastNum; ++i) {
			for(int j = 0; j < middleNum; ++j) {
				for(int k = 0; k < firstNum; ++k) {
					names[index] = LAST[i] + MIDDLE[j] + FIRST[k];
//					randomName = LAST[i] + MIDDLE[j] + FIRST[k];
//					System.out.printf("%d %s\n", cnt ,randomName);
//					cnt++;
					index++;
				}
			}
		}
		randomName = names[randomIndex];
		return randomName;
	}
	
	public int randomSID() {
		builder = new StringBuilder();
		randomSID = (int)(ran.nextInt(100) + 1);
		return randomSID;
	}
	
	public int randomScore() {
		randomScore = ran.nextInt(100) + 1;
		return randomScore;
	}
	
	
	
	@Override
	public String toString() {
		return randomStudent = String.format("%s %s A%04d", randomClass, randomName, randomSID);
	}
	
}
