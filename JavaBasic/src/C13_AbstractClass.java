import myobj.AB;
import myobj.BloodType;

//�������̽��� ���ʰ� �Ǵ� �༮�̷�

public class C13_AbstractClass {
/*
#�߻� Ŭ���� abstract class
�޼����� ���¸� �����س���, ��� �޼����� �ϼ��� �ڽ�Ŭ�������� �̷�� Ŭ����
�߻� �޼��带 ������ Ŭ���� (�ٽ��� �߻� �޼���)
�ڽ� Ŭ������ �߻� Ŭ������ ��ӹ����� �ݵ�� �߻� �޼��带 �������̵� �ؾ� �Ѵ�.

# �߻� �޼��� abstract method
���� �Ǿ� �ְ� ������ ���� �޼���.
�տ� abstract�� �پ� �ִ� �޼���� body�� ���� �߰��� �� ����. 
�ݵ�� ��� ���� �� �ڽ� Ŭ�������� �������̵��Ͽ� �����ؾ� �Ѵ�. 
abstract �޼��带 �������� ���� Ŭ������ �ν��Ͻ��� ������ �� ����. 
��abstract �޼����(); �̰� �� �ִ� Ŭ������ �ν��Ͻ�ȭ �� �Ѵٴ� ��. 
 */
	
	public static void main(String[] args) {
		
		//���� ����� (��) BloodTypeŬ������ ABŬ���� 
		BloodType b1 = new AB();
		//abstract �޼��带 �������� ���� Ŭ������ �ν��Ͻ��� ������ �� ����. 
		// == abstract�޼��尡 �ִ� Ŭ������ �ν��Ͻ��� ������ �� ����? 
		
		// �� BloodTypeŬ���� �ȿ� abstract void character();�� �ְ� �װ� ������ �ڼ�Ŭ������ �̷Ｍ �ν��Ͻ� ������ �� �Ǵ� �ſ���
		//�׷��� ���� �״�� �δ� ��� �ν��Ͻ��� �� �� �ڽ� Ŭ������ AB�� ������ �ߴµ� 
		//�ϴ� ����Ϸ��� public���� ����� �ϴµ� �� ���� �� publicŬ������ �ϳ��� ������ �� �ְ�, �̸��� ���ϸ�� ���ƾ� ��
		//�׷��� ABŬ������ ���� �и����� �� !
		
		//�׸��� ABŬ������ BloodType�� ��������Ƿ� ��ĳ������ ����. �տ� Ÿ������ BloodType�� �� �� �ִ� ����. 
		//(�׸��� ��ĳ���� �ϸ� �θ��� ��� �� �� ����)
		//�״ϱ� AB�� ���������� �ν��Ͻ��� ����ٰ� �ϸ� �ǳ� ��
		
		
		unitAttack(new SwordMan());
		unitAttack(new Archer());
		unitAttack(new Mage());
		//unitAttack(); �� ���� 
		
//		SwordMan unit1 = new SwordMan();
//		Archer unit2 = new Archer();
		
		
//		unit1.slash();
//		unit2.shot();
		

		//unit1.attack();
		//unit2.attack(); //�������̵� �� ������ ��µ�. 
		
		/*
		Unit unit1 = new SwordMan();
		Unit unit2 = new Archer(); 
		unit1.slash();
		unit2.shot();
		//�̷��� ��ĳ���� ���� �� ���ݵ��� ����� �� ����
		
		unitAttack(new SwordMan());
		unitAttack(new Archer());
		//�̷��Ե� �Ұ� 
		 */
		

	}
	
		public static void unitAttack(Unit unit) {
			unit.attack();
		}
		
//		public static void unitAttack(SwordMan sword) {
//			sword.slash();
//		}
		
//		public static void unitAttack(Archer archer) {
//			archer.shot();
//		}
	
	
}


	
	
abstract class Unit { //�߻�޼��带 �������� Ŭ������ abstract�� 
	int attack;
	int hp;
	
	//�ڽ� Ŭ������ �ݵ�� �� �޼��带 �����ؾ� �Ѵ�. 
	//�ʴ� �� ����� �ݵ�� ���� ��� �� ��� ���� �ٷ� �˷��� ( �������̵� ��Դ� ���� ����)
	abstract void attack();  //�߻�޼��� ���� �ε�
	
//	void attack() {
//		//System.out.println("��� ������ ������ ������� ������ �ؾ� �մϴ�. ");	�̰� ���ֵ� ���� ����
//	}
	
}


class Mage extends Unit {
	public Mage() {
		attack = 30;
		hp = 20;
	}

	@Override
	void attack() {
		System.out.println("�����簡 �������� ��¼��~~~~~~");
		
	}
}


class SwordMan extends Unit {
	public SwordMan() {
		attack = 10;
		hp = 50;
	}
	
	@Override  //attack�� �ִµ� �� ���ֱ� ������ �������̵� ���ָ� ��
	void attack() {
		slash();
	}
	
	void slash() {
		System.out.println("Į�� �ֵѷ����ϴ�. ������ : " + attack);
	}
}

class Archer extends Unit {
	double accuracy;  //���߷� 
	public Archer() {
		attack = 8;
		hp = 30;
		accuracy = 0.88;
	}
	
	@Override
	void attack() {
		shot();
	}
	
	void shot() {
		if (Math.random() < accuracy) {
			System.out.println("�����߽��ϴ�." + "������ : " + attack); 	
		} else {
			System.out.println("Ȱ�� ���������ϴ�. . . ");
		}
		
	}
}

