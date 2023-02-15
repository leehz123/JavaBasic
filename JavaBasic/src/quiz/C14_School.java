package quiz;

import java.util.Arrays;
import java.util.Random;

/*
1. 프로그래밍반 학생들을 각자의 국어, 영어, 수학, 프로그래밍 언어, 자료 구조, 운영체제 점수가 있다. 
2. 네트워크반 학생들은 각자의 국어, 영어, 리눅스, 네트워크, CCNA 점수가 있다. 
3. 머신러닝반 학생들은 각자의 국어, 영어, 수학, 통계학, 프로그래망 언어 점수가 있다. 
 
100명의 학생을 랜덩으로 생성한다. 
모든 학생의 소속 반, 과목별 점수, 이름은 랜덤으로 생성돼야 하고,
학번은 중복 없이 순차적으로 생성돼야 한다.  (A00001 이런 식으로 해도되것지)

5. 성적표 출력 메서드를 통해 각 학생의 [이름/각 과목 점수/총점/평균] 을 구할 수 있어야 한다.   
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
		{"프로그래밍반", "네트워크반", "머신러닝반"};
	
	private final static String[] LAST = 
		{"김", "이", "박", "최"};
	
	private final static String[] MIDDLE = 
		{"길", "덕", "정", "은", "현", "강", "미"};
	
	private final static String[] FIRST = 
		{"동", "호", "영", "지", "민", "훈", "신", "숙"};
	
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
		
		//중복없이 하는 건 일단 보류 
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
