package quiz;
//��������. static�ڿ��� ������ Ŭ������ �ϳ� �����غ�����. 
//�ʺ�, ����, ī���� ���� 
//�״ϱ� �ν��Ͻ� > static �� �����ϰ� static > �ν��Ͻ��� ������ �Ұ����ϴٴ� ����?

public class C04_static��������_static���������ϰ���̵���߰� {
	public static void main(String[] args) {
		
		CustomCoffee.guide();
		//CustomCoffee c1 = new CustomCoffee(); �� �´� �⺻�ڵ������ڰ� ��������
		
		//CustomCoffee c1 = new CustomCoffee(int base, int shot, int iceHot);;
		CustomCoffee c1 = new CustomCoffee(0, 4, 0);
		
		//ģȯ�� ver. (�⺻���� ��. static �̿�)
		System.out.println("~~~~~~~~~~~~~~~~ȯ�� ��ȣ ing~~~~~~~~~~~~~~~");
		System.out.println("��	:	" + CustomCoffee.cup);
		System.out.println("����	:	" + CustomCoffee.straw);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//��ȯ�� ver. 
		c1.antiEco("�ö�ƽ ��", "�ö�ƽ ����");
		
		//����, ����ũ�� ����
		c1.sweetness(true, true);
		
		
		System.out.println();
		System.out.println();
		
		c1.orderSheet();
		
		//
		
	}
}

class CustomCoffee {
	//static ����
	static String cup = "�ӱ���";
	static String straw = "���� ����";
	//�ö�ƽ ���븦 ���ϴ� �մ��� static�޼ҵ�� ���븦 �����ع���. �� ���ĺ��ʹ� �׷� �ƿ� �ö�ƽ ����� �� ���� ��
	//�׷��ϱ� �ӱ��Ű� ���̻��븦 static���� �ν��Ͻ� ������ �����ؼ� �⺻������ �����ϴ� ���� �� ����.
	//�׷� static ���� �ұ�?? static ���� �ϴ°� ������? 
	//�׸��� �� ���α׷��� �׳� ����������. ���Ӱ� ������ ���̵�� �߰��غ��� 
	//�� �� �ǿܷ� ������ ��� �ö�ƽ �� ����� �װ͵� �����ϼ�
	
	static String[] bases = {"��", "����"};
	static char[] shots = {'1', '2', '3', '4'};
	static String[] iceOrHot = {"���̽�", "��"}; 
	
	//�ν��Ͻ� ����
	int orderNumber;
	boolean sugar = false;
	boolean cream = false;
	int base;
	int shot;
	int iceHot;
	
	//
	public static void guide() {
		System.out.println("________________________�ֹ� ���̵�__________________________");
		System.out.println("ȯ����å�� ���� �ö�ƽ �Ű� ������ ����� �����Ǿ� �ֽ��ϴ�. ");
		System.out.println("�� : " + CustomCoffee.cup);
		System.out.println("���� : " + CustomCoffee.straw);
		System.out.println("#########Ŀ���� �޴�#########");
		System.out.println("base - ��: 0 /����: 1");
		System.out.println("shot - 1 /2 / 3 / 4");
		System.out.println("iceHot - ���̽�: 0 / ��: 1");
		System.out.println("###########################");
		System.out.println("<�ֹ��Ͻ÷��� �����ڸ� ������ּ���. | ���� : base, shot, iceHot>");
		System.out.println("___________________________________________________________");
		System.out.println();
		
		
	}
	
	
	//������
	public CustomCoffee(int base, int shot, int iceHot) {
		this.base = base;
		this.shot = shot;
		this.iceHot = iceHot;	
		orderNumber++;
		System.out.println("�ֹ������� Ȯ���ϼ���~!");
		System.out.println("���̽�	: " + base);
		System.out.println("��	: " + shot);
		System.out.println("���̽�/��	: " + iceHot);
		System.out.println("�ֹ���ȣ	: " + orderNumber);
		System.out.println();
	}
	
	//static �޼���
	public static void antiEco(String cup, String straw) {  
		CustomCoffee.cup = cup;
		CustomCoffee.straw = straw;
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~ȯ�溸ȣ��å ��ȭ~~~~~~~~~~~~~~");
		System.out.printf ("	����	: 	%s\n", CustomCoffee.straw);
		System.out.printf ("	��	:	%s\n", CustomCoffee.cup);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	
	//�ν��Ͻ� �޼���
	public void sweetness (boolean sugar, boolean cream) {
		this.sugar = sugar;
		this.cream = cream;
		
		System.out.println("����? : " + sugar);
		System.out.println("ũ��? : " +cream);
	}
	
	
	//�ν��Ͻ� �޼���
	public void orderSheet() {
		
		System.out.println("�ֹ���ȣ : " + orderNumber);
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢ��ֹ����ƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("�� : " + cup);
		System.out.println("���� : " + straw);
		System.out.println("���̽� : " + bases[base]);
		System.out.println("�� : " + shots[shot - 1]);
		System.out.println("���̽� / �� : " + iceOrHot[iceHot]);
		System.out.println("���� : " + sugar);
		System.out.println("����ũ�� : " + cream);
	}
	
	
 }













