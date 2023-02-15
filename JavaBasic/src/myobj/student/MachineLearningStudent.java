package myobj.student;

public class MachineLearningStudent extends Student {

	//3. 머신러닝반 학생들은 각자의 국어, 영어, 수학, 통계학, 프로그래망 언어 점수가 있다.
	
	public int kor;
	public int eng;
	public int math;
	public int statistics;
	public int pl;
	
	private final static int SUBJECT_COUNT = 5;
	private final static String CLASS_NAME = "머신러닝";
	
	@Override
	public int sum() {
		return kor + eng + math + statistics + pl;
	}

	@Override
	public double avg() {
		return sum() / SUBJECT_COUNT;
	}

	@Override
	public void printGradeCard() {
		System.out.printf("[%s반]\n"
						+ "%s (%d)\n"
						+ "KOR\t : %d\n"	
						+ "ENG\t : %d\n"						
						+ "MATH\t : %d\n"
						+ "STATISTICS\t : %d\n"
						+ "PL\t : %d\n", CLASS_NAME, name, stuNum, kor, eng, math, statistics, pl);

	}

}
