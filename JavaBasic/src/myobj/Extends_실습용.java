package myobj;

public class Extends_�ǽ��� {
	public static void main(String[] args) {
		
		//(�θ�Ŭ����) 
		Members m1 = new Members();
		m1.classification = "��������Ʈ";
		m1.discountRate = 10;
		m1.benefits();
		
		//��������Ʈ �� (�ڽ�Ŭ����)
		HappyPoint h1 = new HappyPoint();
		h1.setMemberInfo("gold"); 
		h1.benefits();  //MembersŬ������ benefits()�� �ƴ϶� HappyPointŬ���� ���� �������̵��� �޼��尡 ȣ���
		
		/*
		HappyPoint h2 = new HappyPoint();
		h2.setMemberInfo("gold");
		h2.classification = "�׽�Ʈ��"; 
		//�̷��� �ϸ� h2 ��ü(= �ν��Ͻ�)������ classification�� ���� �ٲ��, h1�� classification�� �״��!
		h2.benefits();
		*/
		
		//���ð� (�ڽ�Ŭ����)
		Uplus u1 = new Uplus();
		u1.setMemberInfo();
		u1.benefits(); //MembersŬ������ benefits()�� �ƴ϶� UplusŬ���� ���� �������̵��� �޼��尡 ȣ���
	}
}
