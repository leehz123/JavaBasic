package myobj;

public class Extends_실습용 {
	public static void main(String[] args) {
		
		//(부모클래스) 
		Members m1 = new Members();
		m1.classification = "해피포인트";
		m1.discountRate = 10;
		m1.benefits();
		
		//해피포인트 고객 (자식클래스)
		HappyPoint h1 = new HappyPoint();
		h1.setMemberInfo("gold"); 
		h1.benefits();  //Members클래스의 benefits()가 아니라 HappyPoint클래스 내의 오버라이딩된 메서드가 호출됨
		
		/*
		HappyPoint h2 = new HappyPoint();
		h2.setMemberInfo("gold");
		h2.classification = "테스트값"; 
		//이렇게 하면 h2 실체(= 인스턴스)에서만 classification의 값이 바뀌고, h1의 classification은 그대로!
		h2.benefits();
		*/
		
		//유플고객 (자식클래스)
		Uplus u1 = new Uplus();
		u1.setMemberInfo();
		u1.benefits(); //Members클래스의 benefits()가 아니라 Uplus클래스 내의 오버라이딩된 메서드가 호출됨
	}
}
