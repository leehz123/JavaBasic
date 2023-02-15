/*
# static (���� ����, Ŭ���� ���� <=> �ν��Ͻ� ����)
���� Ŭ������ ��� �ν��Ͻ��� �������� ����ϴ� ������ ���� �����̶�� �Ѵ�. 
��Ű�� ������ (+100��) �ν��Ͻ��� ���߿� 100�� �� �ְ� ������ �ϳ� �� �����ϰ� +100��
�׷��� �ν��Ͻ� 100�� �� ������ �������� �ʿ� ���� ������ ���� ������ ���������� �����س��� ���߿� �� �ִ� 100���� �������� �� ������ �ٶ󺸰� �ִ� ��.  
�տ� static�� ���� �ڿ�(�ʵ� �Ǵ� �޼���)�� ��� �ν��Ͻ��� �������� ����ϴ� �ڿ��� �ȴ�.

static������ �ڿ��� �ƹ��� �ν��Ͻ��� ���Ƶ� Ŭ���� �� �ϳ��̱� ������
Ŭ���� �̸��� .�� ��� ����� �� �ִ�. PlayingCard.width++; 

�ڡڡڡڡڡ�static������ �ڿ��� �ν��Ͻ��� ����� ������ ����� �� �ִ�!!!!�ڡڡڡڡڡ�
(ī�带 �ϳ��� ������ ���� ������ �ʺ�� ���̸� ����� �� �ִ�.)
(System.out.println(PlayingCard.height);)

static�޼���� (�ν��Ͻ��� ����� ������ ����� �� �ֱ� ������) �ν��Ͻ� ������ ������ ����� �� ����.
�׷��� �ν��Ͻ� ������ Ȱ���ϴ� �޼���� �ݵ�� �ν��Ͻ� �޼��忩�� �Ѵ�.
����  
static�ʵ常 ����ϴ� �޼���� static�޼���� ����� ���� ����. 
�ν��Ͻ� ������ Ȱ���ϴ� �޼���� �ݵ�� �ν��Ͻ� �޼��忩�� �Ѵ�. 

*/


public class C04�ǰ�����_Static {
	public static void main(String[] args) {
		
		PlayingCard.changeSize(0, 0); //�̰� �Ӿ� �������� �ִ��� 
		
		PlayingCard h1 = new PlayingCard(1, 1);
		PlayingCard s1 = new PlayingCard(1, 1);
		PlayingCard d10 = new PlayingCard(1, 10);
		
		PlayingCard.width++; 
		//h1.width++;��� �ϸ� h1���� Ŭ���� �̸��� ��� �ϴ°� �� ������ ��� static way�� �ϸ鼭 ����� ġ�� �������� 
		
		for(int i = 0; i < 5; ++i) {
			PlayingCard.width++;
			h1.print();
			s1.print();
			d10.print(); //����Ʈ�� ������ ī���� �ʺ� �þ�� (?????????)
		}
		
		System.out.println(h1.width);
		System.out.println(s1.width); //�� �� 100���� 
		
		//�ٵ� d10�� �ʺ� �ٲٸ� �� �ٲ����� (�� d10�ƴϰ� h1, s1�� �ٲ�)
		//d10.width = 10000;
		
		System.out.println(h1.width);
		System.out.println(s1.width);
		System.out.println(d10.width);
		//static�� ȥ�ڸ��� ������ �ƴ϶�� ��!
		d10.width = 3;
		
		h1.print();
		s1.print();
		d10.print();
	}	
}

class PlayingCard {
	//��� �ν��Ͻ��� �Բ� ����� ��(static����, Ŭ���� ����, ���� ����)
	static int width =100;
	static int height =200;  //�ʺ� 100�̰� ���̰� 200�ΰ� ���ƾ� �Ѵ�. h1�̵� s1�̵� ..
	
	static char[] suits = {'��', '��' ,'��', '��'};
	//ī�带 �ϳ��� ���� �� �ƴ��ݾ�?
	//��� ī����� ��ȣ�� �޶� �� ��ȣ�� ������ �Ȱ��� �����ϴϱ� �̷� �͵� static�� ����� �ȴ�. 
	
	//�� �ν��Ͻ��� �ڱ⸸�� ������ ������ ����� ��(�ν��Ͻ� ����)
	int suit; //���
	int num;
	
	
	public static void changeSize(int width, int height) {
		//this�� �ν��Ͻ��� ������ �� �ڱ� �ڽ��� �ǹ��ϹǷ� static�޼��忡���� ����� �� ����. 
		//void�� ��� �޼��忡���� �ƾ���?
		PlayingCard.width = width; //���⼱ �� this�� �� ��!!!!!!this�� �ν��Ͻ��� ��������� �� �ڱ� �ڽ��̱� ����
		PlayingCard.height = height; 
		System.out.println("�ٲ� �ʺ� : " + PlayingCard.width);
		System.out.println("�ٲ� ���� : " + PlayingCard.height);
		
		//System.out.println("����ī���� ���� : " + suits[suit]); �̰� �� �� 
		//static������ ��� ī�尡 �ٶ󺸰� �ִ� ���̴ϱ� ������ ī�� ��絵 ���� �� ���� ������? >> �ƴ� 
		//�ν��Ͻ��� ���� ������ ���� ������ ���� �ִٴϱ�. static���忡�� �ν��Ͻ�����(���ڰ� �ٸ� �� �ִ� ����)�� �� �� ����(��ȣ ��� �� �Ұ�)
		//static�޼���� ��ö���ϰԡ� static������ �͸� ���!!!!!
	}
	
	
	
	public PlayingCard(int suit, int num) {
	 this.suit = suit;
	 this.num = num;
	}
	
	public void print() {
		System.out.print("��������");
		for(int i = 0; i < width; ++i) {
			System.out.print('��'); //width��ŭ ���θ� ������Ű�� ����.. �� �Ӹ� �����ͳ� 
		}
		System.out.println("��������");  //�׸��� �����ʸ������κ��� ����ϰ��� �ٹٲ� ����ߵ�
		
		System.out.printf ("��   %c%2d", suits[suit], num);
		
		for(int i = 0; i < width; ++i) {
			System.out.print(' ');
		}
		System.out.println("��");
		
		
		System.out.print("��������");
		
		for(int i = 0; i < width; ++i) {
			System.out.print('��');
		}
		
		System.out.println("��������");
	}
	
}