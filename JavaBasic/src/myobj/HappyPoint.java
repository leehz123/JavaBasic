package myobj;

public class HappyPoint extends Members {
	
	public String MembershipLevel;
	public int bonusBreads;
	
	
	public void setMemberInfo(String MembershipLevel) {
		super.classification = "��������Ʈ";
		super.discountRate = 15;
		this.MembershipLevel = MembershipLevel;
		
		if (MembershipLevel.equalsIgnoreCase("Gold") || MembershipLevel.equals("���")) {
			bonusBreads = 500;
		} else if (MembershipLevel.equalsIgnoreCase("Silver") || MembershipLevel.equals("Gold")) {
			bonusBreads = 100;
		}
	}
	
 	
	@Override
	public void benefits() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("�������. " + classification + " ����, " + discountRate + "% ���� �����Ͻʴϴ�." );
		
		if(MembershipLevel.equalsIgnoreCase("Gold") || MembershipLevel.equals("���")) {
			System.out.println("���� ȸ������ ����� " + MembershipLevel + "�̸�, ��" + bonusBreads + "���� �� �帳�ϴ�.");
		} else if(MembershipLevel.equalsIgnoreCase("Silver") || MembershipLevel.equals("�ǹ�")) {
			System.out.println("���� ȸ������ ����� " + MembershipLevel + "�̸�, ��" + bonusBreads + "���� �� �帳�ϴ�.");
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	
}
