package myobj.pocketmon;

public class Trainer {  //�� ��� ���ϸ� ��� �� �޾ҳ� Ʈ���̳ʰ� ���ϸ��� �� �� �����ϱ�.. 
	//Pocketmon[] own_pocketmon = new Pocketmon[6];�̰� Ŭ������ ���������̶� ������ �ǰ���
	
	String name;
	
	//�ƢƢƢƢƢƢƢƢƢƢ�Ʈ���̳� �̸� �����ϴ� �޼���ƢƢƢƢƢƢƢƢƢƢ�
	public Trainer(String name) {  //�����ڷ� ����
		this.name = name;
	}	//�ٵ� �̰� �� �̿� �� ��? '����'��� ������ �� ����f
	//�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�
	
	
	//�ƢƢƢƢƢƢư���(�迭) �ȿ� ���ϸ� �� ���� ������� ���� �ʰ��ϸ� �˷��ָ鼭 ���� �����Ű��, ���ϸ� ���� ������ �迭 �ȿ� ���ϸ�(+��������) �߰��ϴ� �޼���ƢƢƢƢƢƢ�
	Pocketmon[] own_pocketmon = new Pocketmon[6];          //���̰͵� ��ĳ�����̷�! �׷��� ���ϸ� ������ ����� ����� �� ���� �ȴ�
	//���⿡ ���ϸ� 200������ ���� ���� ������ �ϱ� ���� ���� ����̴�. 
	//(�� �̸� �ӿ����� ���� �߾��µ� ����� �״ϱ� ������ �ǰ� ���̸��� �ǰ� ��ī��1�� �ǰ� ��ī�� 2�� �ȴٴ� �� ������?) 
	int index = 0;
	//�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ����ϸ� ��� �޼���ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�
	public void catchPocketmon(Pocketmon poke) {
		//���ϸ� ��ٰ� ���濡 6���� ���� ���� �� �� ��´ٰ� �˷��ְ� ���α׷� ����
		if (index == 6) {
			System.out.println("�ָӴϰ� ���� ���� " + poke.name + "�� �����־����ϴ�!");
			return;
		}
		own_pocketmon[index++] = poke; //���� ���ϸ�(+����) �迭 �ȿ� �־��ֱ� 
	}
	//�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�
	
	
	//�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢư��濡 �� ������ ���ϸ�鿡 ���� ������ ����ϴ� �޼��� �ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�
	//����(�迭) �ȿ� ��� ���ϸ���� ������ ������� ������ printStats()�޼���(��Ŭ=Pocketmon �ȿ� ����) �ȿ� �� printf()�Լ��� ���
	public void printOwn() {
		for(int i = 0; i < index; ++i) {
			own_pocketmon[i].printStats();
		}
	}
	//�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�

	
	
	
	//�̹��� ������ TrainerŬ�������� �غ���~
	public static void main(String[] args) {
		
		Trainer t = new Trainer("����");
		t.catchPocketmon(new Pocketmon("�̻��ؾ�" , 1, 2, 3, 4, 5, 6)); 
		//������ ������� ���� ���� ���ϸ�
		
		//���ϸ� ��� �޼��� catchPocketmon(). (TrainerŬ������ ����)
		t.catchPocketmon(new Pikachu()); 
		t.catchPocketmon(new Pikachu());
		t.catchPocketmon(new Pikachu());
		t.catchPocketmon(new Pichu());
		t.catchPocketmon(new Pichu()); //���⼭���� �ָӴ� �������� ���ϸ� ����ٰ� �� ��. public void catchPocketmon(Pocketmon poke) { if�� �ߵ�
		//������ ������� ���� ���ϸյ�
		
		
		t.printOwn();  //���±��� ���� ���ϸ� ��� ���Ȱ� �Բ� ���?
		
		
//		Pikachu pika = new Pikachu();
//		pika.printStats();
//
//		Pichu pichu = new Pichu();
//		pichu.tackle();
//		pichu.printStats(); //�� �г� �Է� �� �ߴµ� �� ���ڴ�� �� ���͡������������������������ 
//		
	}
}

