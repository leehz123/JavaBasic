package myobj;

public class Uplus extends Members {
	
	int freeMovieTickets;
	
	Uplus() {
		super.discountRate = 10;
	}
 	
	public void setMemberInfo() {
		super.classification = "Uplus";
		super.discountRate = 20;
		freeMovieTickets = 200;
	}
	
	
	@Override
	public void benefits() {
		System.out.println("#####################################################");
		System.out.println("어서오세요. " + classification + " 고객님, " + discountRate + "% 할인 가능하십니다." );
		System.out.println("고객 감사 이벤트로 빵 구매시 무료영화티켓 " + freeMovieTickets + "장을 선물로 드립니다. ");
		System.out.println("#####################################################");
		System.out.println();
	}
}
