package myobj.pocketmon;

public class Pikachu extends Pocketmon { //����� ������ �ɷ�ġ ������ ������
	
	static String defaultName = "Pikachu";

	public Pikachu() {
		super( //�θ�(Pocketmon)�� �����ڷ� ���� >> ���ϸ��� �ɷ�ġ���� ���� ä������ ��. 
				//nickname(defaultName),  //�̰� ������ �̸� �ĳֱ� ���ŷο�ϱ� �׳� defaultName���� �Ѵ� �ߴ� �� ����
				//Pocketmon(�θ�)�� �ִ� �޼��� ȣ��
				//��.. defaultName�� ������ �𸣰ڳ� 
				//defaultName �� �� ���� null�� ���޵ż� ���� �Ⱦ��� ���׿����ڷ� ��¼�� �ؼ� t�� nickname()�� �ٽ� ȣ���ؾ� �ϰ� f�� null�� ����� �ϴϱ� �װ� �� ����
				//�����ڿ� �����ؼ� �־��ַ� �ؼ� defaultName�� �ʿ��޴� ���� 
				//�װ� �ƴϰ� õõ�� �Ʒ��� �Է� �ް� �׷��� ���� �̷� �ʿ� ���� 
				
				defaultName, 
				(int)(Math.random() * 50 + 100),
				(int)(Math.random() * 50 + 100),
				(int)(Math.random() * 50 + 100),
				(int)(Math.random() * 50 + 100),
				(int)(Math.random() * 50 + 100),
				(int)(Math.random() * 50 + 100)
		);
		
	}
	
	
	public void thunder() {
		System.out.println(name + "�� ���� ������ �ֽ��ϴ�. ��������" + sAtk * 1.5 +  "�Դϴ�.");
		
	}
}
