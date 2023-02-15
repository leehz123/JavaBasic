package myobj.student;

public class MachineLearningStudent extends Student {

	//3. �ӽŷ��׹� �л����� ������ ����, ����, ����, �����, ���α׷��� ��� ������ �ִ�.
	
	public int kor;
	public int eng;
	public int math;
	public int statistics;
	public int pl;
	
	private final static int SUBJECT_COUNT = 5;
	private final static String CLASS_NAME = "�ӽŷ���";
	
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
		System.out.printf("[%s��]\n"
						+ "%s (%d)\n"
						+ "KOR\t : %d\n"	
						+ "ENG\t : %d\n"						
						+ "MATH\t : %d\n"
						+ "STATISTICS\t : %d\n"
						+ "PL\t : %d\n", CLASS_NAME, name, stuNum, kor, eng, math, statistics, pl);

	}

}
