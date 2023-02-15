package quiz;

public class C04_static연습_강사님버전 {
	public static void main(String[] args) {
		
	}
}

class SolidR4 {
	//클래스요소, 정적요소(개조 불가능한 부분들)
	//사람들이 가진 SolidR4들이 공통적으로 가진 속성들 
	static int price = 8000;
	static int drift = 90;
	static int acc = 49;
	static int cornering = 556;
	static int boostTime = 440;
	static int boostCharge = 200;
	static String category = "스피드 카트 / 일반";
	static String description = "솔리드 시리즈의 본격적인 레이스용 바디입니다. " 
									+ "G3에서 안정화된 바디라인은 R4에 이르러 큰 진화를 하게 됩니다.";
		
	static String[] colorNames = {"빨간색", "노란색", "초록색", "파란색", "검은색", "흰색", "핑크색"};
	
	//각자에게 다른 요소 (동적이구나 그러고보니)
	//인스턴스 영역 (개조 가능한 부분들)
	String enginPatch;
	String kit;
	String handle;
	String wheel;
	String owner;
	int paint;
	
	
	
}