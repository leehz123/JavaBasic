package myobj.pocketmon;

public class Pichu extends Pocketmon {
	static String defaultName = "Pichu";
	
	public Pichu() {
		super(
				//nickname(defaultName), //�̰͵� ������ �̸� �ĳֱ� ���ŷο�ϱ� �׳� defaultName���� �Ѵ� �ߴ� �� ����
				defaultName,
				(int)(Math.random() * 50 + 70),
				(int)(Math.random() * 50 + 70),
				(int)(Math.random() * 50 + 70),
				(int)(Math.random() * 50 + 70),
				(int)(Math.random() * 50 + 70),
				(int)(Math.random() * 50 + 70)
		);	
		
		//�г����� �ٲٽðڽ��ϱ�?
		this.name = nickname(defaultName);
		//�̷��� �ϸ� �����۵� ��. �ٵ� dafaultName�ڸ��� getName()�� ������ �ϸ� ������ ���ٴ� ��. 
	}
	
	//���� ���⿡ getName()�� �ְ�
	public String getName() {
		return "name";
	}
	
	public void tackle() {
		System.out.printf(name + "�� �����ġ��� " + atk  * 0.7 + "�� �������� ������. ");
	}
}
