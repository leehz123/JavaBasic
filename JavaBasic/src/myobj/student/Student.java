package myobj.student;

abstract public class Student implements Average, GradeCard {
	 
	abstract public int sum();
	
	abstract public double avg();
	
	abstract public void printGradeCard();
	
	private static String[] firstName = {"태현", "규환", "도현", "은희", "경태", "민호", "성훈", 
										"효정", "효민", "진우", "인택", "승필", "수민", "영욱", "현지", "몽운", "유진", "준혁"};
	
	private static String[] lastName = {"고", "강", "김", "권", "박", "베", "송", "안", 
										"이", "최", "장", "홍", "하"};
	
	private static int currStuNum = 1000;
	
	protected String name; //모든 학생은 개인의 이름과 학번을 갖고 있쥐 __이거떔에 Student가 인스턴스가 되기 애매함
	protected int stuNum;
	//name과 stuNum 도 남이 함부로 직접접근하지 못하게 통로 막아 놓기.
	//자식클래스에서는 봐야 하니까 protected로(private말고) 
	
	protected Student() { //학생이 아무학생이나 막 생기길 원하지 않음. ProgrammingStudent 나 .. 같은 자식클래스들만 건들 수 있도록 protected 
		name = getRanName();
		stuNum = currStuNum++; //학생 인스턴스 만들 때마다 학생수 증가시키기. 그리고 그걸 저장하는 CurrStuNum 은 static이어야 함!
	}
	
	@Override
	public String toString() {
		return name + "[" + stuNum + "]";
	}

	public static String getRanName() {
		return lastName[(int)(Math.random() * lastName.length)]
				+ firstName[(int)(Math.random() * firstName.length)];
	}
	
	
	
	
//	public static void main(String[] args) {
//		
//		for(int i =0 ; i < 100; ++i) {
//			System.out.println(new Student());
//		}
//	
//	}
	
}
