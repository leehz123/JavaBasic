package myobj.student;

public class NetworkStudent extends Student {
	
	//2. ��Ʈ��ũ�� �л����� ������ ����, ����, ������, ��Ʈ��ũ, CCNA ������ �ִ�.
	
	int kor;
	int eng;
	int math;
	int linux;
	int network;
	int ccna;
	
	private final static int SUBJECT_COUNT = 6;
	private final static String CLASS_NAME = "��Ʈ��ũ";
	
	public NetworkStudent() {
		kor = (int)(Math.random() * 101);
		eng = (int)(Math.random() * 101);
		math = (int)(Math.random() * 101);
		linux = (int)(Math.random() * 101);
		network = (int)(Math.random() * 101);
		ccna = (int)(Math.random() * 101);
	}
	
	@Override
	public int sum() {
		return eng + math + linux + network + ccna;
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
				+ "LINUX\t : %d\n"
				+ "NETWORK\t : %d\n"
				+ "CCNA\t : %d\n" , CLASS_NAME, name, stuNum, kor, eng, math, linux, network, ccna);
	}

}
