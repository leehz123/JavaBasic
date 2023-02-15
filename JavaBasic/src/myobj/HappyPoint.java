package myobj;

public class HappyPoint extends Members {
	
	public String MembershipLevel;
	public int bonusBreads;
	
	
	public void setMemberInfo(String MembershipLevel) {
		super.classification = "해피포인트";
		super.discountRate = 15;
		this.MembershipLevel = MembershipLevel;
		
		if (MembershipLevel.equalsIgnoreCase("Gold") || MembershipLevel.equals("골드")) {
			bonusBreads = 500;
		} else if (MembershipLevel.equalsIgnoreCase("Silver") || MembershipLevel.equals("Gold")) {
			bonusBreads = 100;
		}
	}
	
 	
	@Override
	public void benefits() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("어서오세요. " + classification + " 고객님, " + discountRate + "% 할인 가능하십니다." );
		
		if(MembershipLevel.equalsIgnoreCase("Gold") || MembershipLevel.equals("골드")) {
			System.out.println("현재 회원님의 등급은 " + MembershipLevel + "이며, 빵" + bonusBreads + "개를 더 드립니다.");
		} else if(MembershipLevel.equalsIgnoreCase("Silver") || MembershipLevel.equals("실버")) {
			System.out.println("현재 회원님의 등급은 " + MembershipLevel + "이며, 빵" + bonusBreads + "개를 더 드립니다.");
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	
}
