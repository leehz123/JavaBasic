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
		System.out.println("�������. " + classification + " ����, " + discountRate + "% ���� �����Ͻʴϴ�." );
		System.out.println("�� ���� �̺�Ʈ�� �� ���Ž� ���῵ȭƼ�� " + freeMovieTickets + "���� ������ �帳�ϴ�. ");
		System.out.println("#####################################################");
		System.out.println();
	}
}
